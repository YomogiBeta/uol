package ksu.yomogi.vm;

import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.errors.MissingArgumentsError;
import ksu.yomogi.vm.interfaces.Executable;
import ksu.yomogi.vm.interfaces.Value;

import java.util.ArrayList;
import java.util.HashMap;

public class InstanceAndMessage implements Executable, Value {

    private final MessageContent aMessage;
    private final InstanceContent anInstance;

    /**
     * コンストラクタメソッド
     * @param message メッセージ
     * @param instance インスタンス
     */
    public InstanceAndMessage(MessageContent message, InstanceContent instance) {
        this.aMessage = message;
        this.anInstance = instance;
    }

    /**
     * メッセージを応答するメソッド
     * @return メッセージ
     */
    public MessageContent getMessage() {
        return this.aMessage;
    }

    /**
     * インスタンスを応答するメソッド
     * @return インスタンス
     */
    public InstanceContent getInstance() {
        return this.anInstance;
    }

    /**
     * 束縛しているメッセージを実行するメソッド
     * @param aDataManager データマネージャ
     * @return ビジター
     * @throws MissingArgumentsError
     */
    public UolVisitor execute(DataManager aDataManager) throws MissingArgumentsError {
        return this.execute(new ArrayList<>(), aDataManager);
    }

    /**
     * 束縛しているメッセージを実行するメソッド
     * @param anArguments 引数
     * @param aDataManager データマネージャ
     * @return ビジター
     * @throws MissingArgumentsError
     */
    public UolVisitor execute(ArrayList<Object> anArguments, DataManager aDataManager) throws MissingArgumentsError {
        aDataManager.pushVariableMap((HashMap) this.anInstance.getMembers());
        String aTargetClassName = this.anInstance.getClassName();
        if (!aTargetClassName.equals("You") && !aTargetClassName.equals("True") && !aTargetClassName.equals("False"))
            aDataManager.pushStackTrace(this.anInstance);
        UolVisitor aVisitor = this.aMessage.execute(anArguments, aDataManager);
        aDataManager.popVariableMap();
        if (!aTargetClassName.equals("You") && !aTargetClassName.equals("True") && !aTargetClassName.equals("False"))
            aDataManager.popStackTrace();
        return aVisitor;
    }

    /**
     * インスタンス自身を応答するメソッド
     * @param aDataManager データマネージャ
     * @return
     */
    public Object value(DataManager aDataManager) {
        return this;
    }

    public String toString() {
        StringBuffer aStringBuffer = new StringBuffer();
        aStringBuffer.append("Instance and Message { ");
        aStringBuffer.append(this.anInstance.toString());
        aStringBuffer.append(" , ");
        aStringBuffer.append(this.aMessage.toString());
        aStringBuffer.append(" } ");
        return aStringBuffer.toString();
    }

    public boolean equals(Object anObject){
        if (anObject == null) return false;
        if (this == anObject) return true;
        if (anObject instanceof InstanceAndMessage anOther) {
            return this.anInstance.equals(anOther.getInstance()) && this.aMessage.equals(anOther.getMessage());
        }
        return false;
    }

    public int hashCode() {
        return this.anInstance.hashCode() + this.aMessage.hashCode();
    }


}
