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

    /**
     * コンストラクトメソッド
     * @param name メンバ名
     * @param className クラス名
     * @param modifier 修飾子
     * @param instruction 指示トークン
     * @param value 値
     */
    public MemberContent(String name, String className, String modifier, String instruction, Object value) {
        this.aName = name;
        this.aClassName = className;
        this.aModifier = modifier;
        this.anInstruction = instruction;
        this.aValue = value;
    }

    /**
     * 修飾子を応答するメソッド
     * @return 修飾子
     */
    public String getModifier() {
        return this.aModifier;
    }

    /**
     * 指示トークンを応答するメソッド
     * @return 指示トークン
     */
    public String getInstruction() {
        return this.anInstruction;
    }

    /**
     * 値を応答するメソッド
     * @return 値
     */
    public Object getValue() {
        return this.aValue;
    }

    /**
     * 参照可能かどうかを確認し、可能であれば値を応答するメソッド
     * @param aDataManager
     * @return
     * @throws PrivateMemberCallError
     * @throws PrimitiveMemberCallError
     */
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

    /**
     * 参照可能かどうかを確認し、可能であれば値を設定するメソッド
     * @param value
     * @param aDataManager
     */
    public void setValue(Object value, DataManager aDataManager) {
        if (this.aModifier.equals("private") && !aDataManager.getSender().equals(this.aClassName)){
            throw new PrivateMemberCallError(this.aName, null);
        }
        this.aValue = value;
    }

    public String toString() {
        StringBuffer aStringBuffer = new StringBuffer();
        aStringBuffer.append("{ ");
        aStringBuffer.append(this.aModifier);
        aStringBuffer.append(" ");
        aStringBuffer.append(this.anInstruction);
        aStringBuffer.append(" } ");
        aStringBuffer.append(this.aValue);
        if (this.aValue == null)
            return aStringBuffer.append("null").toString();
        return aStringBuffer.append(this.aValue).toString();
    }

    public boolean equals(Object anObject) {
        if (anObject == null) return false;
        if (anObject == this) return true;
        if (anObject instanceof MemberContent anOther) {
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
