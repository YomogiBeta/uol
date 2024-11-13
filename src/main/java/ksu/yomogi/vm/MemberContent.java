package ksu.yomogi.vm;

import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.errors.*;
import ksu.yomogi.vm.interfaces.Value;

public class MemberContent extends Object implements Value<Object>, Cloneable {

    private final String aName;
    private final String aClassName;
    private final String aModifier;
    private final String anInstruction;
    private Object aValue;

    public MemberContent(String name, String className, String modifier, String instruction, Object value) {
        this.aName = name;
        this.aClassName = className;
        this.aModifier = modifier;
        this.anInstruction = instruction;
        this.aValue = value;
    }

    public String getModifier() {
        return this.aModifier;
    }

    public String getInstruction() {
        return this.anInstruction;
    }

    public Object getValue() {
        return this.aValue;
    }

    public Object value(DataManager aDataManager) throws PrivateMemberCallError, PrimitiveMemberCallError {
        boolean aPrimitiveMode = aDataManager.isPrimitiveOnlyMode();
        if (this.anInstruction.equals("primitiveOnly") && !aPrimitiveMode) {
            throw new PrimitiveMemberCallError(this.aName, null);
        }

        if (!aPrimitiveMode && this.aModifier.equals("private") && !aDataManager.getSender().equals(this.aClassName)){
            throw new PrivateMemberCallError(this.aName, null);
        }
        return this.aValue;
    }

    public void setValue(Object value, DataManager aDataManager) {
        if (this.aModifier.equals("private") && !aDataManager.getSender().equals(this.aClassName)){
            throw new PrivateMemberCallError(this.aName, null);
        }
        this.aValue = value;
    }

    public String toString() {
        String aString = "{ " + this.aModifier + " " + this.anInstruction + " } ";
        if (this.aValue == null)
            return aString + "null";
        return aString + this.aValue;
    }

    public boolean equals(Object obj) {
        if (obj instanceof MemberContent anOther) {
            return this.aValue.equals(anOther.getValue())
                    && this.aModifier.equals(anOther.getModifier())
                    && this.anInstruction.equals(anOther.getInstruction());
        }
        return false;
    }

    public int hashCode() {
        return (this.aValue.hashCode() + this.aModifier.hashCode() + this.anInstruction.hashCode()
        );
    }

    public MemberContent clone() {
        return new MemberContent(this.aName, this.aClassName, this.aModifier, this.anInstruction, this.aValue);
    }
}
