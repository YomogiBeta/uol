package ksu.yomogi.vm;

import ksu.yomogi.vm.errors.NotFoundSymbolError;
import ksu.yomogi.vm.interfaces.Chainable;
import ksu.yomogi.vm.interfaces.Value;

import java.util.ArrayList;
import java.util.HashMap;

public class InstanceContent extends Object implements Chainable, Value<InstanceContent> {

    private final String aClassName;
    private final String aParentClassName;

    private HashMap<String, MemberContent> aMembers = new HashMap<>();

    public InstanceContent(String className, String parentClassName, HashMap<String, MemberContent> members) {
        this.aClassName = className;
        this.aParentClassName = parentClassName;
        this.aMembers = members;
    }

    public String getClassName() {
        return this.aClassName;
    }

    public String getParentClassName() {
        return this.aParentClassName;
    }

    public HashMap<String, MemberContent> getMembers() {
        return this.aMembers;
    }

    public UolVisitor execute(String message, ArrayList<Object> arguments, UolVisitor aVisitor) throws NotFoundSymbolError {
        MessageContent aMessage = aVisitor.getDataManager().searchMessage(this.aClassName, message);

        if (aMessage == null) {
            if (ClassContent.CONSTRUCT_METHOD.equals(message)) {
                return null;
            }
            throw new NotFoundSymbolError(message, null);
        }
        LambdaContent aLambda = aMessage.getLambda();
        return aLambda.execute(arguments, aVisitor.getDataManager());
    }

    public HashMap<String, MemberContent> getValuesMap() {
        return this.aMembers;
    }

    public InstanceContent value() {
        return this;
    }

    public String toString() {
        return this.aClassName + "Instance";
    }

    public boolean equals(Object obj) {
        if (obj instanceof InstanceContent anOther) {
            return this.aClassName.equals(anOther.getClassName())
                    && this.aParentClassName.equals(anOther.getParentClassName())
                    && this.aMembers.equals(anOther.getMembers());
        }
        return false;
    }

    public int hashCode() {
        return this.aClassName.hashCode() + this.aParentClassName.hashCode() + this.aMembers.hashCode();
    }
}
