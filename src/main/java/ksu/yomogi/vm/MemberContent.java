package ksu.yomogi.vm;

import ksu.yomogi.vm.interfaces.Value;

public class MemberContent extends Object implements Value<Object> {

    private final String aModifier;
    private final String anInstruction;
    private Object aValue;

    public MemberContent(String modifier, String instruction, Object value) {
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

    public Object value() {
        return this.aValue;
    }

    public void setValue(Object value) {
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
            return this.aValue.equals(anOther.value())
                    && this.aModifier.equals(anOther.getModifier())
                    && this.anInstruction.equals(anOther.getInstruction());
        }
        return false;
    }

    public int hashCode() {
        return (this.aValue.hashCode() + this.aModifier.hashCode() + this.anInstruction.hashCode()
        );
    }
}
