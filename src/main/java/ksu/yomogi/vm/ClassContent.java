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

    public ClassContent(String className, String parentClassName, HashMap<String, MemberContent> members, HashMap<String, MessageContent> messages) {
        this.aClassName = className;
        this.aParentClassName = parentClassName;
        this.aMembers = members;
        this.aMessages = messages;
    }

    public String getClassName() {
        return this.aClassName;
    }

    public String getParentClassName() {
        return this.aParentClassName;
    }

    public HashMap<String, MemberContent> getMembers() {
        return this.aMembers;
    }

    public HashMap<String, MessageContent> getMessages() {
        return this.aMessages;
    }

    public String toString() {
        return this.aClassName + "Class";
    }

    public boolean equals(Object obj) {
        if (obj instanceof ClassContent anOther) {
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
