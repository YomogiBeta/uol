package ksu.yomogi.vm;

import java.util.HashMap;

/**
 * クラス定義の内容を保持するクラス。
 * クラス名、親クラス名、メンバ、メッセージを保持する。
 * このクラスのインスタンス化の際は、クラス名、親クラス名、メンバをインスタンスコンテンツにクローンし、メッセージはClassContentから参照する。
 */
public class ClassContent extends Object {

    private final String aClassName;
    private final String aParentClassName;

    private HashMap<String, MemberContent> aMembers = new HashMap<>();
    private HashMap<String, Object> aMessages = new HashMap<>();

    public ClassContent(String className, String parentClassName, HashMap<String, MemberContent> members, HashMap<String, Object> messages) {
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

    public HashMap<String, Object> getMessages() {
        return this.aMessages;
    }
}
