package ksu.yomogi.vm;

public class ImportLabel extends Object{

    private String aTrueLabel;
    private String aSubLabel;

    public ImportLabel(String trueLabel, String subLabel) {
        this.aTrueLabel = trueLabel;
        this.aSubLabel = subLabel;
    }

    public ImportLabel (String trueLabel) {
        this.aTrueLabel = trueLabel;
        this.aSubLabel = trueLabel;
    }

    public String getTrueLabel() {
        return this.aTrueLabel;
    }

    public String getSubLabel() {
        return this.aSubLabel;
    }

    public String toString() {
        return this.aTrueLabel + " " + this.aSubLabel;
    }

}
