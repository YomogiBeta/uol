package ksu.yomogi.vm.escapes;

public class IfStatementReturnEscape extends RuntimeException {
    private Object aReturnValue;

    /**
     * コンストラクトメソッド
     */
    public IfStatementReturnEscape() {
        super();
    }

    /**
     * if文内での応答値を設定するメソッド
     * @param value 応答値
     */
    public void setReturnValue(Object value) {
        this.aReturnValue = value;
    }

    /**
     * if分内での応答値を取得するメソッド
     * @return 応答値
     */
    public Object getReturnValue() {
        return this.aReturnValue;
    }
}
