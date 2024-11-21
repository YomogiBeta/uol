package ksu.yomogi.vm;

import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.errors.MissingArgumentsError;
import ksu.yomogi.vm.interfaces.Executable;
import ksu.yomogi.vm.interfaces.Value;

import java.util.ArrayList;
import java.util.HashMap;

public class InstanceAndMessage implements Executable, Value {

    private final MessageContent aMessage;
    private final InstanceContent aInstance;

    public InstanceAndMessage(MessageContent message, InstanceContent instance) {
        this.aMessage = message;
        this.aInstance = instance;
    }

    public MessageContent getMessage() {
        return this.aMessage;
    }

    public InstanceContent getInstance() {
        return this.aInstance;
    }

    public UolVisitor execute(DataManager aDataManager) throws MissingArgumentsError {
        return this.execute(new ArrayList<>(), aDataManager);
    }

    public UolVisitor execute(ArrayList<Object> anArguments, DataManager aDataManager) throws MissingArgumentsError {
        aDataManager.pushVariableMap((HashMap) this.aInstance.getMembers());
        String aTargetClassName = this.aInstance.getClassName();
        if (!aTargetClassName.equals("You") && !aTargetClassName.equals("True") && !aTargetClassName.equals("False"))
            aDataManager.pushStackTrace(this.aInstance);
        UolVisitor aVisitor = this.aMessage.execute(anArguments, aDataManager);
        aDataManager.popVariableMap();
        if (!aTargetClassName.equals("You") && !aTargetClassName.equals("True") && !aTargetClassName.equals("False"))
            aDataManager.popStackTrace();
        return aVisitor;
    }

    public Object value(DataManager aDataManager) {
        return this;
    }

    public String toString() {
        StringBuffer aStringBuffer = new StringBuffer();
        aStringBuffer.append("Instance and Message { ");
        aStringBuffer.append(this.aInstance.toString());
        aStringBuffer.append(" , ");
        aStringBuffer.append(this.aMessage.toString());
        aStringBuffer.append(" } ");
        return aStringBuffer.toString();
    }

    public boolean equals(Object anObject){
        if (anObject == null) return false;
        if (this == anObject) return true;
        if (anObject instanceof InstanceAndMessage anOther) {
            return this.aInstance.equals(anOther.getInstance()) && this.aMessage.equals(anOther.getMessage());
        }
        return false;
    }

    public int hashCode() {
        return this.aInstance.hashCode() + this.aMessage.hashCode();
    }


}
