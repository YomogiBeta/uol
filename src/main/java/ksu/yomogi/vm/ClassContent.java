package ksu.yomogi.vm;

import java.util.HashMap;

/**
 * クラス定義の内容を保持するクラス。
 * クラス名、親クラス名、メンバ、メッセージを保持する。
 * このクラスのインスタンス化の際は、クラス名、親クラス名、メンバをインスタンスコンテンツにクローンし、メッセージはClassContentから参照する。
 */
public class ClassContent extends Object {

    public static final String CONSTRUCT_METHOD = "__construct";

    private final String aClassName;
    private final String aParentClassName;

    private HashMap<String, MemberContent> aMembers = new HashMap<>();
    private HashMap<String, MessageContent> aMessages = new HashMap<>();

    /**
     * コンストラクタメソッド
     * @param className クラス名
     * @param parentClassName 親クラス名
     * @param members メンバマッピ
     * @param messages メッセージマップ
     */
    public ClassContent(String className, String parentClassName, HashMap<String, MemberContent> members, HashMap<String, MessageContent> messages) {
        this.aClassName = className;
        this.aParentClassName = parentClassName;
        this.aMembers = members;
        if (messages == null) {
            messages = new HashMap<>();
        }
        this.aMessages = messages;
    }

    /**
     * クラス名を応答するメソッド
     * @return クラス名
     */
    public String getClassName() {
        return this.aClassName;
    }

    /**
     * 親クラス名を応答するメソッド
     * @return 親クラス名
     */
    public String getParentClassName() {
        return this.aParentClassName;
    }

    /**
     * 自作言語上でのクラスが持つメンバマップを応答するメソッド
     * @return メンバマップ
     */
    public HashMap<String, MemberContent> getMembers() {
        if (this.aMembers == null) {
            return new HashMap<>();
        }
        return this.aMembers;
    }

    /**
     * 自作言語上でのクラスが持つメッセージマップを応答するメソッド
     * @return メッセージマップ
     */
    public HashMap<String, MessageContent> getMessages() {
        return this.aMessages;
    }

    public String toString() {
        return this.aClassName + "Class";
    }

    public boolean equals(Object anObject) {
        if (anObject == null) return false;
        if (anObject == this) return true;
        if (anObject instanceof ClassContent anOther) {
            return this.aClassName.equals(anOther.getClassName())
                    && this.aParentClassName.equals(anOther.getParentClassName())
                    && this.aMembers.equals(anOther.getMembers())
                    && this.aMessages.equals(anOther.getMessages());
        }
        return false;
    }

    public int hashCode() {
        return this.aClassName.hashCode() + this.aParentClassName.hashCode() + this.aMembers.hashCode() + this.aMessages.hashCode();
    }
}
