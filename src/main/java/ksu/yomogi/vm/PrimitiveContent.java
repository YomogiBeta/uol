package ksu.yomogi.vm;

import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.interfaces.Value;

public class PrimitiveContent extends Object implements Value<Object> {

    private Object aValue;
    private String aType;

    /**
     * コンストラクトメソッド
     * @param value 仮想マシン上での値
     * @param type  自作言語上での型名
     */
    public PrimitiveContent(Object value, String type) {
        this.aValue = value;
        this.aType = type;
    }

    /**
     * 仮想マシン上での値を応答するメソッド
     * @return 仮想マシン上での値
     */
    public Object getValue() {
        return aValue;
    }

    /**
     * 仮想マシンの処理状況によって、許可されている場合に、仮想マシン上での値を応答するメソッド
     * @return 仮想マシン上での値
     */
    public Object value(DataManager aDataManager) {
        return aValue;
    }

    /**
     * 自作言語上での型名を応答するメソッド
     * @return 自作言語上での型名
     */
    public String getType() {
        return aType;
    }

    /**
     * 仮想マシン上での値と自作言語上での型名を設定するメソッド
     * @param value 仮想マシン上での値
     * @param type  自作言語上での型名
     */
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
