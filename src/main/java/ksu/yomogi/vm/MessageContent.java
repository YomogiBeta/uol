package ksu.yomogi.vm;

import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.errors.MissingArgumentsError;
import ksu.yomogi.vm.errors.PrimitiveMethodCallError;
import ksu.yomogi.vm.errors.PrivateMethodCallError;
import ksu.yomogi.vm.interfaces.Executable;
import ksu.yomogi.vm.primitive_equipment.PrimitiveExecute;

import java.util.ArrayList;

public class MessageContent extends Object implements Executable {

    private final String aName;
    private final String aClassName;
    private final String aModifier;
    private final String anInstruction;
    private LambdaContent aLambda;

    /**
     * コンストラクタメソッド
     * @param name メッセージ名
     * @param className クラス名
     * @param modifier 修飾子
     * @param instruction 指示トークン
     * @param lambda ラムダコンテンツ
     */
    public MessageContent(String name, String className, String modifier, String instruction, LambdaContent lambda) {
        this.aName = name;
        this.aClassName = className;
        this.aModifier = modifier;
        this.anInstruction = instruction;
        this.aLambda = lambda;
    }

    /**
     * 修飾子を応答するメソッド
     * @return 修飾子
     */
    public String getModifier() {
        return this.aModifier;
    }

    /**
     * 指示トークンを応答するメソッド
     * @return 指示トークン
     */
    public String getInstruction() {
        return this.anInstruction;
    }

    /**
     * メッセージのラムダコンテンツを応答するメソッド
     * @return　ラムダコンテンツ
     */
    public LambdaContent getLambda() {
        return this.aLambda;
    }

    /**
     * メッセージを実行するメソッド
     * @param aDataManager
     * @return
     * @throws MissingArgumentsError
     */
    public UolVisitor execute(DataManager aDataManager) throws MissingArgumentsError {
        return this.execute(new ArrayList<>(), aDataManager);
    }

    /**
     * メッセージを実行するメソッド
     * @param anArguments
     * @param aDataManager
     * @return
     * @throws MissingArgumentsError
     * @throws PrivateMethodCallError
     */
    public UolVisitor execute(ArrayList<Object> anArguments, DataManager aDataManager) throws MissingArgumentsError, PrivateMethodCallError {
        boolean aPrimitiveOnlyMode = aDataManager.isPrimitiveOnlyMode();
        if (this.anInstruction.equals("primitiveOnly") && !aPrimitiveOnlyMode) {
            throw new PrimitiveMethodCallError(this.aName, null);
        }
        if (!aPrimitiveOnlyMode && this.aModifier.equals("private") && !aDataManager.getSender().equals(this.aClassName)) {
            throw new PrivateMethodCallError(this.aName, null);
        }

        if (!this.aClassName.equals("True") && !this.aClassName.equals("False"))
            aDataManager.setSender(this.aClassName);

        if (this.anInstruction.equals("primitive")){
            Object result = PrimitiveExecute.execute(this.aClassName, this.aName, anArguments, aDataManager);
            aDataManager.setSender("");
            aDataManager.removeDataMapContent(DataManager.ARGUMENT_LIST);
            UolVisitor aVisitor = new UolVisitor();
            aVisitor.setReturnValue(result);
            return aVisitor;
        }

        UolVisitor aVisitor = this.aLambda.execute(anArguments, aDataManager);
        if (!this.aClassName.equals("True") && !this.aClassName.equals("False"))
            aDataManager.setSender("");
        return aVisitor;
    }

    public String toString() {
        StringBuffer aStringBuffer = new StringBuffer();
        aStringBuffer.append("{ ");
        aStringBuffer.append(this.aModifier);
        aStringBuffer.append(" ");
        aStringBuffer.append(this.anInstruction);
        aStringBuffer.append(" } Message");
        return aStringBuffer.toString();
    }

    public boolean equals(Object anObject) {
        if (anObject == null) return false;
        if (anObject == this) return true;
        if (anObject instanceof MessageContent anOther) {
            return this.aLambda.equals(anOther.getLambda())
                    && this.aModifier.equals(anOther.getModifier())
                    && this.anInstruction.equals(anOther.getInstruction());
        }
        return false;
    }

    public int hashCode() {
        return (this.aLambda.hashCode() + this.aModifier.hashCode() + this.anInstruction.hashCode()
        );
    }
}
