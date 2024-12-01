package ksu.yomogi.vm;

public class ImportLabel extends Object{

    private String aTrueLabel;
    private String aSubLabel;

    /**
     * コンストラクトメソッド
     * @param trueLabel 真名
     * @param subLabel 仮名
     */
    public ImportLabel(String trueLabel, String subLabel) {
        this.aTrueLabel = trueLabel;
        this.aSubLabel = subLabel;
    }

    /**
     * コンストラクトメソッド
     * @param trueLabel 真名
     */
    public ImportLabel (String trueLabel) {
        this.aTrueLabel = trueLabel;
        this.aSubLabel = trueLabel;
    }

    /**
     * 真名を応答するメソッド
     * @return 真名
     */
    public String getTrueLabel() {
        return this.aTrueLabel;
    }

    /**
     * 仮名を応答するメソッド
     * @return 仮名
     */
    public String getSubLabel() {
        return this.aSubLabel;
    }

    public String toString() {
        return this.aTrueLabel + " " + this.aSubLabel;
    }

    public boolean equals(Object anObject) {
        if (anObject == null) return false;
        if (anObject == this) return true;
        if (anObject instanceof ImportLabel anOther) {
            return this.aTrueLabel.equals(anOther.getTrueLabel()) && this.aSubLabel.equals(anOther.getSubLabel());
        }
        return false;
    }

    public int hashCode() {
        return this.aTrueLabel.hashCode() + this.aSubLabel.hashCode();
    }

}
