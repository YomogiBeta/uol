package ksu.yomogi.vm;

import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.interfaces.Value;

public class PrimitiveContent extends Object implements Value<Object> {

    private Object aValue;
    private String aType;

    public PrimitiveContent(Object value, String type) {
        this.aValue = value;
        this.aType = type;
    }

    public Object getValue() {
        return aValue;
    }

    public Object value(DataManager aDataManager) {
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
        if (this.aValue == null)
            return "nil";
        return this.aValue.toString();
    }

    public boolean equals(Object anObject) {
        if (anObject == null) return false;
        if (anObject == this) return true;
        if (anObject instanceof PrimitiveContent anOther) {
            return this.aValue.equals(anOther.getValue()) && this.aType.equals(anOther.getType());
        }
        return false;
    }

    public int hashCode() {
        return this.aValue.hashCode() + this.aType.hashCode();
    }
}
