package ksu.yomogi.vm.datamanager;

import ksu.yomogi.vm.ClassContent;
import ksu.yomogi.vm.InstanceAndMessage;
import ksu.yomogi.vm.InstanceContent;
import ksu.yomogi.vm.MessageContent;

import java.util.*;

public class DataManager extends Object {

    /**
     * HashMapのキー
     */
    public static final String CACHE_MESSAGE_MAP = "cacheMessageMap";
    public static final String CACHE_MEMBER_MAP = "cacheMemberMap";
    public static final String ARGUMENT_DEFINE_MAP = "argumentDefineMap";

    /**
     * リストのキー
     */
    public static final String IMPORT_LABEL_STACK = "importLabelStack";
    public static final String ARGUMENT_LIST = "argumentList";
    public static final String CACHE_CLASS_NAME = "cacheClassName";
    public static final String BOOLEAN_CLASS_STACK = "booleanClassStack";

    /**
     * Stringのキー
     */
    public static final String CACHE_PARENT_CLASS_NAME = "cacheParentClassName";

    /**
     * Counterのキー
     */
    public static final String DEFAULT_ARGUMENT_DEFINE_COUNT = "defaultArgumentDefineCount";
    public static final String ARGUMENT_COUNT = "argumentCount";
    public static final String CHAIN_COUNT = "chainCount";


    private final Stack<Object> aDataStack = new Stack<Object>();
    private final Stack<HashMap<String, Object>> aVariableMap = new Stack<HashMap<String, Object>>(){{
        push(new HashMap<String, Object>());
    }};
    private InstanceContent aCurrentChainTarget = null;
    private Stack<InstanceContent> aSearchTargetStack = new Stack<>();

    private static final HashMap<String, ClassContent> aClassMap = new HashMap<String, ClassContent>();

    private static final Stack<InstanceContent> aStackTrace = new Stack<InstanceContent>();

    private final HashMap<String, Object> aDataMap = new HashMap<String, Object>();
    private final HashMap<String, SimpleCounter> aCounterMap = new HashMap<String, SimpleCounter>();

    private String aSender = "";

    private boolean aPrimitiveOnlyMode = false;

    /**
     * データスタックを応答するメソッド
     *
     * @return データスタック
     */
    public Stack<Object> getDataStack() {
        return this.aDataStack;
    }


    /**
     * 検索対象クラス名を設定するメソッド。リリースが行われるまで、変数ゲットの際にメッセージサーチも行うように指示する。
     *
     * @param anInstanceContent
     */
    public void setSearchTargetClassName(InstanceContent anInstanceContent) {
        this.aSearchTargetStack.push(anInstanceContent);
    }

    /**
     * 検索対象クラス名をリリースするメソッド
     */
    public void rollbackSearchTargetClassName() {
        if (!this.aSearchTargetStack.isEmpty()) this.aSearchTargetStack.pop();
    }

    /**
     * このデータマネージャをメッセージやラムダ実行に引き継ぐべきがどうかを応答するメッセージ
     *
     * @return 引き継ぐべきであればtrue
     */
    public boolean isShouldBeTakenOver() {
        return !this.aSearchTargetStack.isEmpty();
    }

    /**
     * 変数マップを応答するメソッド
     *
     * @return 変数マップ
     */
    public HashMap<String, Object> getVariableMap() {
        if (this.aCurrentChainTarget != null) return (HashMap) this.aCurrentChainTarget.getMembers();
        return this.aVariableMap.peek();
    }

    /**
     * 変数マップをプッシュするメソッド
     * @param aVariableMap
     */
    public void pushVariableMap(HashMap<String, Object> aVariableMap) {
        this.aVariableMap.push(new HashMap<>(aVariableMap));
    }

    /**
     * 変数マップに引数の変数マップをマージするメソッド
     * @param aVariableMap
     */
    public void mergeVariableMap(HashMap<String, Object> aVariableMap) {
        this.getVariableMap().putAll(aVariableMap);
    }

    /**
     * 変数マップをポップするメソッド
     */
    public void popVariableMap() {
        if (this.aVariableMap.size() > 1) this.aVariableMap.pop();
    }

    /**
     * 現在のチェインターゲットを設定するメソッド
     *
     * @param aCurrentChainTarget チェインターゲット
     */
    public void setCurrentChainTarget(InstanceContent aCurrentChainTarget) {
        this.aCurrentChainTarget = aCurrentChainTarget;
        if (aCurrentChainTarget != null) this.setSearchTargetClassName(aCurrentChainTarget);
    }

    /**
     * 現在のチェインターゲットを応答するメソッド
     *
     * @return チェインターゲット
     */
    public InstanceContent getCurrentChainTarget() {
        return this.aCurrentChainTarget;
    }

    /**
     * 指定したクラス名とメッセージ名に対応するメッセージのコンテンツを応答するメソッド
     *
     * @param aClassName   クラス名
     * @param aMessageName メッセージ名
     * @return メッセージのコンテンツ
     */
    public MessageContent searchMessage(String aClassName, String aMessageName) {
        while (aClassName != null) {
            ClassContent aClassContent = this.getClassContent(aClassName);
            if (aClassContent == null) {
                return null;
            }
            if (aClassContent.getMessages().get(aMessageName) != null) {
                return aClassContent.getMessages().get(aMessageName);
            }

            aClassName = aClassContent.getParentClassName();
        }
        return null;
    }

    private String prepareKey(String key) {
        if (key.equals("self") || key.equals("super")) {
            return this.aSender + "-" + key;
        }
        return key;
    }

    /**
     * 変数マップからキーに対応する変数のコンテンツを応答するメソッド
     *
     * @param key 　キー
     * @return 変数のコンテンツ
     */
    public Object getVariableContent(String key) {
        String aKey = this.prepareKey(key);
        if (aKey.equals("you")){
            return this.getBeforeStackTraceInstance();
        }
        Object aValue = this.getVariableMap().get(aKey);
        if (aValue == null) {
            if (!this.aSearchTargetStack.isEmpty()) {
                MessageContent aMessage = this.searchMessage(this.aSearchTargetStack.getLast().getClassName(), key);
                if (aMessage != null)  return new InstanceAndMessage(aMessage, this.aSearchTargetStack.getLast());
            }
        }
        return aValue;
    }

    /**
     * 変数マップにキーと値を設定するメソッド
     *
     * @param key   キー
     * @param value 値
     */
    public void setVariableContent(String key, Object value) {
        this.getVariableMap().put(key, value);
    }

    /**
     * 変数マップからキーに対応する変数のコンテンツを削除するメソッド
     *
     * @param key キー
     */
    public void deleteVariableContent(String key) {
        this.getVariableMap().remove(key);
    }

    /**
     * クラスマップからクラス名に対応するクラスのコンテンツを応答するメソッド
     *
     * @param className クラス名
     * @return クラスのコンテンツ
     */
    public ClassContent getClassContent(String className) {
        return this.aClassMap.get(className);
    }

    /**
     * クラスマップにクラス名とクラスのコンテンツを設定するメソッド
     *
     * @param className    クラス名
     * @param classContent クラスのコンテンツ
     */
    public void setClassContent(String className, ClassContent classContent) {
        this.aClassMap.put(className, classContent);
    }

    /**
     * スタックトレースにインスタンスのコンテンツを追加するメソッド
     *
     * @param instanceContent インスタンスのコンテンツ
     */
    public void pushStackTrace(InstanceContent instanceContent) {
        this.aStackTrace.push(instanceContent);
    }

    /**
     * スタックトレースからインスタンスのコンテンツを削除するメソッド
     */
    public void popStackTrace() {
        this.aStackTrace.pop();
    }

    /**
     * スタックトレースからインスタンスのコンテンツを応答するメソッド
     *
     * @return インスタンスのコンテンツ
     */
    private InstanceContent getStackTraceInstance() {
        if (this.aStackTrace.isEmpty()) return null;
        return this.aStackTrace.peek();
    }

    /**
     * スタックトレースから一つ前のインスタンスのコンテンツを応答するメソッド
     * @return インスタンスのコンテンツ
     */
    public InstanceContent getBeforeStackTraceInstance() {
        if (this.aStackTrace.size() < 2) return null;
        List aReversedList = this.aStackTrace.reversed();
        Iterator<InstanceContent> anIterator = aReversedList.iterator();
        while (anIterator.hasNext()) {
            InstanceContent anInstance = anIterator.next();
            if (anInstance != this.getStackTraceInstance()) return anInstance;
        }
        return null;
    }

    /**
     * プリミティブオンリーコールであるかどうかを設定するメッセージ
     *
     * @param primitiveOnlyMode プリミティブオンリーモード
     */
    public void setPrimitiveOnlyMode(boolean primitiveOnlyMode) {
        this.aPrimitiveOnlyMode = primitiveOnlyMode;
    }

    /**
     * プリミティブオンリーモードであるかどうかを応答するメッセージ
     *
     * @return プリミティブオンリーモードであればtrue、そうでなければfalse
     */
    public boolean isPrimitiveOnlyMode() {
        return this.aPrimitiveOnlyMode;
    }


    /**
     * 辞書からキーに対応するデータのコンテンツを応答するメソッド
     *
     * @param aDataMapKey 　キー
     * @param <TYPE>      　データの型
     * @return　データのコンテンツ
     */
    public <TYPE> TYPE getDataMapContent(String aDataMapKey) {
        if (aDataMapKey.equals(DataManager.ARGUMENT_LIST)){
            return (TYPE) this.aDataMap.get(aDataMapKey);
        }
        return (TYPE) this.aDataMap.get(aDataMapKey);
    }

    /**
     * 辞書にキーと値を設定するメソッド
     *
     * @param aDataMapKey     　キー
     * @param aDataMapContent 　値
     */
    public void setDataMapContent(String aDataMapKey, Object aDataMapContent) {
        if (this.aDataMap.containsKey(aDataMapKey)) {
            this.aDataMap.replace(aDataMapKey, aDataMapContent);
        } else {
            this.aDataMap.put(aDataMapKey, aDataMapContent);
        }
    }

    /**
     * 辞書に対応するキーが存在しない場合に、キーと値を設定するメソッド。キーに対応するコンテンツがある場合は何もしない。
     *
     * @param aDataMapKey     　キー
     * @param aDataMapContent 　値
     */
    public void setDataMapContentIfAbsent(String aDataMapKey, Object aDataMapContent) {
        this.aDataMap.putIfAbsent(aDataMapKey, aDataMapContent);
    }

    /**
     * 辞書からキーに対応するデータのコンテンツを削除するメソッド
     *
     * @param aDataMapKey キー
     */
    public void removeDataMapContent(String aDataMapKey) {
        this.aDataMap.remove(aDataMapKey);
    }

    /**
     * キーに対応するハッシュマップのコンテンツキーに対応するコンテンツを応答するメソッド
     *
     * @param aDataMapKey 　辞書のキー
     * @param aContentKey コンテンツのキー
     * @param <TYPE>      　コンテンツの型
     * @return　コンテンツ
     */
    public <TYPE> TYPE getDataMapDeepContent(String aDataMapKey, String aContentKey) {
//        this.setDataMapContentIfAbsent(aDataMapKey, new HashMap<String, Object>());
        HashMap<String, Object> aMap = this.getDataMapContent(aDataMapKey);
        return (TYPE) aMap.get(aContentKey);
    }

    /**
     * キーに対応するハッシュマップのコンテンツキーに対応するコンテンツを設定するメソッド
     *
     * @param aDataMapKey 辞書のキー
     * @param aContentKey コンテンツのキー
     * @param aContent    コンテンツ
     */
    public void setDataMapDeepContent(String aDataMapKey, String aContentKey, Object aContent) {
//        this.setDataMapContentIfAbsent(aDataMapKey, new HashMap<String, Object>());
        HashMap<String, Object> aMap = this.getDataMapContent(aDataMapKey);
        aMap.put(aContentKey, aContent);
        this.setDataMapContent(aDataMapKey, aMap);
    }

    /**
     * 辞書から、キーに対応するカウンターを応答するメソッド
     *
     * @param counterName 　カウンター名
     * @return　SimpleCounter
     */
    public SimpleCounter getCounter(String counterName) {
        this.aCounterMap.putIfAbsent(counterName, new SimpleCounter());
        return this.aCounterMap.get(counterName);
    }

    /**
     * センダーを設定するメソッド
     */
    public void setSender(String aSender) {
        if (aSender.equals("") && this.aStackTrace.size() > 1) {
            InstanceContent anBeforeInstance = this.aStackTrace.get(this.aStackTrace.size() - 2);
            if (anBeforeInstance != null) {
                this.aSender = anBeforeInstance.getClassName();
                return;
            }
        }
        this.aSender = aSender;
    }

    /**
     * センダーを応答するメソッド
     */
    public String getSender() {
        return this.aSender;
    }

}
