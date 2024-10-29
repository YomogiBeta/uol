package ksu.yomogi.vm.datamanager;

import ksu.yomogi.vm.ClassContent;
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

    private HashMap<String, Object> aDefaultVariableMap = new HashMap<String, Object>();
    private final ArrayList<HashMap<String, Object>> aTempVariableMap = new ArrayList<HashMap<String, Object>>();
    private boolean anIsTempVariableMap = false;
    private Stack<String> aSearchTargetClassNameStack = new Stack<>();

    private static final HashMap<String, ClassContent> aClassMap = new HashMap<String, ClassContent>();

    private final HashMap<String, Object> aDataMap = new HashMap<String, Object>();
    private final HashMap<String, SimpleCounter> aCounterMap = new HashMap<String, SimpleCounter>();

    private String aSender = "";

    private Integer aVariableIndex = null;

    private boolean aNativeOnlyMode = false;

    /**
     * データスタックを応答するメソッド
     * @return データスタック
     */
    public Stack<Object> getDataStack() {
        return this.aDataStack;
    }

    public void tempRollbackVariableMap() {
        if (this.aTempVariableMap.size() > 1) {
            if (this.aVariableIndex == null) this.aVariableIndex = this.aTempVariableMap.size() - 2;
            else if (this.aVariableIndex > 0) this.aVariableIndex--;
        }
    }

    public void resetTempRollbackVariableMap() {
        this.aVariableIndex = null;
    }

    private HashMap<String, Object> getVariableMap() {
        if (this.anIsTempVariableMap) {
            if (aVariableIndex == null) return this.aTempVariableMap.getLast();
            return this.aTempVariableMap.get(aVariableIndex);
        }
        return this.aDefaultVariableMap;
    }

    /**
     * 指定した変数マップを、リリースが行われるまで利用するように指示するメソッド
     * @param variableMap Map&lt;String, Object&gt; 変数マップ (可変朝引数)
     */
    public final void useVariableMap(Object variableMap) {
        this.aTempVariableMap.add((HashMap<String, Object>) variableMap);
        this.anIsTempVariableMap = true;
    }

    /**
     * 現在の変数マップに指定した変数マップをマージするメソッド
     * @param variableMap
     */
    public final void mergeVariableMap(Object variableMap) {
        this.getVariableMap().putAll((HashMap<String, Object>) variableMap);
    }

    /**
     * 変数マップをリリースするメソッド
     */
    public final void rollbackVariableMap() {
        if (!this.aTempVariableMap.isEmpty()) this.aTempVariableMap.removeLast();
        if (aTempVariableMap.isEmpty()) this.anIsTempVariableMap = false;
    }

    /**
     * 検索対象クラス名を設定するメソッド。リリースが行われるまで、変数ゲットの際にメッセージサーチも行うように指示する。
     * @param aClassName
     */
    public void setSearchTargetClassName(String aClassName) {
        this.aSearchTargetClassNameStack.push(aClassName);
    }

    /**
     * 検索対象クラス名をリリースするメソッド
     */
    public void rollbackSearchTargetClassName() {
        if (!this.aSearchTargetClassNameStack.isEmpty()) this.aSearchTargetClassNameStack.pop();
    }

    /**
     * このデータマネージャをメッセージやラムダ実行に引き継ぐべきがどうかを応答するメッセージ
     * @return 引き継ぐべきであればtrue
     */
    public boolean isShouldBeTakenOver() {
        return !this.aSearchTargetClassNameStack.isEmpty() || this.anIsTempVariableMap;
    }

    /**
     * 指定したクラス名とメッセージ名に対応するメッセージのコンテンツを応答するメソッド
     * @param aClassName クラス名
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

    private String prepareKey(String key){
        if (key.equals("self") || key.equals("super")){
            return this.aSender + "-" + key;
        }
        return key;
    }

    /**
     * 変数マップからキーに対応する変数のコンテンツを応答するメソッド
     * @param key　キー
     * @return 変数のコンテンツ
     */
    public Object getVariableContent(String key) {
        String aKey = this.prepareKey(key);
        Object aValue =  this.getVariableMap().get(aKey);
        if (aValue == null) {
            if (!this.aSearchTargetClassNameStack.isEmpty()) {
                MessageContent aMessage = this.searchMessage(this.aSearchTargetClassNameStack.getLast(), key);
                if (aMessage != null) {
                    return aMessage;
                }
            }
            aValue = this.aDefaultVariableMap.get(aKey);
        }
        return aValue;
    }

    /**
     * 変数マップにキーと値を設定するメソッド
     * @param key キー
     * @param value 値
     */
    public void setVariableContent(String key, Object value) {
        this.getVariableMap().put(key, value);
    }

    /**
     * 変数マップからキーに対応する変数のコンテンツを削除するメソッド
     * @param key キー
     */
    public void deleteVariableContent(String key) {
        this.getVariableMap().remove(key);
    }

    /**
     * 変数マップを設定するメソッド
     * @param variableMap 変数マップ
     */
    public void setVariableMap(HashMap<String, Object> variableMap) {
        this.aDefaultVariableMap = new HashMap<>(variableMap);
    }

    /**
     * クラスマップからクラス名に対応するクラスのコンテンツを応答するメソッド
     * @param className クラス名
     * @return クラスのコンテンツ
     */
    public ClassContent getClassContent(String className) {
        return this.aClassMap.get(className);
    }

    /**
     * クラスマップにクラス名とクラスのコンテンツを設定するメソッド
     * @param className クラス名
     * @param classContent クラスのコンテンツ
     */
    public void setClassContent(String className, ClassContent classContent) {
        this.aClassMap.put(className, classContent);
    }

    /**
     * ネイティブオンリーコールであるかどうかを設定するメッセージ
     * @param nativeOnlyMode ネイティブオンリーモード
     */
    public void setNativeOnlyMode(boolean nativeOnlyMode){
        this.aNativeOnlyMode = nativeOnlyMode;
    }

    /**
     * ネイティブオンリーモードであるかどうかを応答するメッセージ
     * @return ネイティブオンリーモードであればtrue、そうでなければfalse
     */
    public boolean isNativeOnlyMode(){
        return this.aNativeOnlyMode;
    }


    /**
     * 辞書からキーに対応するデータのコンテンツを応答するメソッド
     * @param aDataMapKey　キー
     * @return　データのコンテンツ
     * @param <TYPE>　データの型
     */
    public <TYPE> TYPE getDataMapContent(String aDataMapKey) {
        return (TYPE) this.aDataMap.get(aDataMapKey);
    }

    /**
     * 辞書にキーと値を設定するメソッド
     * @param aDataMapKey　キー
     * @param aDataMapContent　値
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
     * @param aDataMapKey　キー
     * @param aDataMapContent　値
     */
    public void setDataMapContentIfAbsent(String aDataMapKey, Object aDataMapContent) {
        this.aDataMap.putIfAbsent(aDataMapKey, aDataMapContent);
    }

    /**
     * 辞書からキーに対応するデータのコンテンツを削除するメソッド
     * @param aDataMapKey キー
     */
    public void removeDataMapContent(String aDataMapKey) {
        this.aDataMap.remove(aDataMapKey);
    }

    /**
     * キーに対応するハッシュマップのコンテンツキーに対応するコンテンツを応答するメソッド
     * @param aDataMapKey　辞書のキー
     * @param aContentKey  コンテンツのキー
     * @return　コンテンツ
     * @param <TYPE>　コンテンツの型
     */
    public <TYPE> TYPE getDataMapDeepContent(String aDataMapKey, String aContentKey) {
//        this.setDataMapContentIfAbsent(aDataMapKey, new HashMap<String, Object>());
        HashMap<String, Object> aMap = this.getDataMapContent(aDataMapKey);
        return (TYPE) aMap.get(aContentKey);
    }

    /**
     * キーに対応するハッシュマップのコンテンツキーに対応するコンテンツを設定するメソッド
     * @param aDataMapKey 辞書のキー
     * @param aContentKey コンテンツのキー
     * @param aContent コンテンツ
     */
    public void setDataMapDeepContent(String aDataMapKey, String aContentKey, Object aContent) {
//        this.setDataMapContentIfAbsent(aDataMapKey, new HashMap<String, Object>());
        HashMap<String, Object> aMap = this.getDataMapContent(aDataMapKey);
        aMap.put(aContentKey, aContent);
        this.setDataMapContent(aDataMapKey, aMap);
    }

    /**
     * 辞書から、キーに対応するカウンターを応答するメソッド
     * @param counterName　カウンター名
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
        this.aSender = aSender;
    }

    /**
     * センダーを応答するメソッド
     */
    public String getSender() {
        return this.aSender;
    }

}
