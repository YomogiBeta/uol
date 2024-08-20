package ksu.yomogi.vm;

public class MemberContent extends Object {

    private final String aModifier;
    private final String anInstruction;
    private Object aValue;
    private String aType;

    public MemberContent(String modifier, String instruction, Object value, String type) {
        this.aModifier = modifier;
        this.anInstruction = instruction;
        this.aValue = value;
        this.aType = type;
    }

    public String getModifier() {
        return this.aModifier;
    }

    public String getInstruction() {
        return this.anInstruction;
    }

    public Object getValue() {
        return aValue;
    }

    public String getType() {
        return aType;
    }

    public void setValue(Object value, String type) {
        this.aValue = value;
        this.aType = type;
    }

    public String toString() {
        String aString = "{ " + this.aModifier + " " + this.anInstruction + " " + this.aType + " } ";
        if (aValue == null)
            return aString + "null";
        return aString + this.aValue.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof MemberContent anOther) {
            return this.aValue.equals(anOther.getValue())
                    && this.aType.equals(anOther.getType())
                    && this.aModifier.equals(anOther.getModifier())
                    && this.anInstruction.equals(anOther.getInstruction());
        }
        return false;
    }

    public int hashCode() {
        return (this.aValue.hashCode() + this.aType.hashCode() + this.aModifier.hashCode() + this.anInstruction.hashCode()
        );
    }
}
