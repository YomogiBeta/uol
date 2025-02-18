package ksu.yomogi.vm;

import ksu.yomogi.parser.uolParser;
import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.errors.MissingArgumentsError;
import ksu.yomogi.vm.interfaces.Executable;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class LambdaContent extends Object implements Executable {

    private LinkedHashMap<String, Object> aVariableMap = null;
    private Integer anArgumentsCount = 0;
    private Integer aDefaultArgumentsCount = 0;
    private uolParser.ExpressionListContext aRunnableContext = null;

    /**
     * コンストラクトメソッド
     * @param aVariableMap 引数名と値のマップ
     * @param aDefaultArgumentDefineCount　デフォルト引数の数
     * @param aRunnableContext　実行する構文木
     */
    public LambdaContent(LinkedHashMap<String, Object> aVariableMap, Integer aDefaultArgumentDefineCount, uolParser.ExpressionListContext aRunnableContext) {
        if (aVariableMap == null) {
            aVariableMap = new LinkedHashMap<>();
        }
        this.aVariableMap = aVariableMap;
        this.aDefaultArgumentsCount = aDefaultArgumentDefineCount;
        this.aRunnableContext = aRunnableContext;

        this.anArgumentsCount = this.aVariableMap.size() - this.aDefaultArgumentsCount;
    }

    /**
     * ラムダを実行するメソッド。
     * @param aDataManager
     * @return
     * @throws MissingArgumentsError
     */
    public UolVisitor execute(DataManager aDataManager) throws MissingArgumentsError {
        return this.execute(new ArrayList<>(), aDataManager);
    }

    /**
     * ラムダを実行するメソッド。
     * @param anArguments
     * @param aDataManager
     * @return
     * @throws MissingArgumentsError
     */
    public UolVisitor execute(ArrayList<Object> anArguments, DataManager aDataManager) throws MissingArgumentsError {

        if (anArguments == null) {
            anArguments = new ArrayList<>();
        }

        ArrayList<Object> aFinalArguments = anArguments;

        if (this.anArgumentsCount != aFinalArguments.size()) {
            throw new MissingArgumentsError(this.anArgumentsCount, aFinalArguments.size(), null);
        }
        UolVisitor aVisitor = new UolVisitor();
        aVisitor.setDataManager(aDataManager);

//        if (aDataManager.isShouldBeTakenOver()) {
//            aVisitor.setDataManager(aDataManager);
//        }

        if (!aFinalArguments.isEmpty()) {
            AtomicReference<Integer> anIndex = new AtomicReference<>(0);
            this.aVariableMap.sequencedKeySet().forEach((aKey) -> {
                this.aVariableMap.replace(aKey, aFinalArguments.get(anIndex.get()));
                anIndex.getAndSet(anIndex.get() + 1);
            });

            aVisitor.getDataManager().mergeVariableMap(this.aVariableMap);
        }
        Integer aCacheChainCount = aDataManager.getCounter(DataManager.CHAIN_COUNT).getCount();
        aDataManager.getCounter(DataManager.CHAIN_COUNT).reset();

        aDataManager.removeDataMapContent(DataManager.ARGUMENT_LIST);

        aVisitor.visitExpressionList(aRunnableContext);

        aDataManager.getCounter(DataManager.CHAIN_COUNT).set(aCacheChainCount);
        return aVisitor;
    }

    public String toString() {
        return "Lambda";
    }

    public boolean equals(Object anObject) {
        if (anObject == null) return false;
        if (anObject == this) return true;
        if (anObject instanceof LambdaContent anOther) {
            return this.aVariableMap.equals(anOther.aVariableMap)
                    && this.anArgumentsCount.equals(anOther.anArgumentsCount)
                    && this.aDefaultArgumentsCount.equals(anOther.aDefaultArgumentsCount)
                    && this.aRunnableContext.equals(anOther.aRunnableContext);
        }
        return false;
    }

    public int hashCode() {
        return this.aVariableMap.hashCode() + this.anArgumentsCount.hashCode() + this.aDefaultArgumentsCount.hashCode() + this.aRunnableContext.hashCode();
    }
}
