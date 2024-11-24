package ksu.yomogi.vm.escapes;

public class IfStatementReturnEscape extends RuntimeException {
    private Object aReturnValue;
    public IfStatementReturnEscape() {
        super();
    }

    public void setReturnValue(Object value) {
        this.aReturnValue = value;
    }

    public Object getReturnValue() {
        return this.aReturnValue;
    }
}
