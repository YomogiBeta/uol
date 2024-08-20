package ksu.yomogi.vm;

public class PrimitiveContent extends Object {

    private Object aValue;
    private String aType;

    public PrimitiveContent(Object value, String type) {
        this.aValue = value;
        this.aType = type;
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
        return this.aValue.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof PrimitiveContent anOther) {
            return this.aValue.equals(anOther.getValue()) && this.aType.equals(anOther.getType());
        }
        return false;
    }

    public int hashCode() {
        return this.aValue.hashCode() + this.aType.hashCode();
    }
}
