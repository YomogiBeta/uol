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
        if (!this.aInstance.getClassName().equals("You")) aDataManager.pushStackTrace(this.aInstance);
        UolVisitor aVisitor = this.aMessage.execute(anArguments, aDataManager);
        aDataManager.popVariableMap();
        if (!this.aInstance.getClassName().equals("You")) aDataManager.popStackTrace();
        return aVisitor;
    }

    public Object value(DataManager aDataManager) {
        return this;
    }
}
