package ksu.yomogi.vm;

import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.errors.NotFoundSymbolError;
import ksu.yomogi.vm.interfaces.Chainable;
import ksu.yomogi.vm.interfaces.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstanceContent extends Object implements Chainable, Value<InstanceContent> {

    private final String aClassName;
    private String aParentClassName = null;

    private HashMap<String, MemberContent> aMembers = new HashMap<>();

    public InstanceContent(String className, DataManager aDataManager) {
        ClassContent aClassContent = aDataManager.getClassContent(className);
        ClassContent aParentClassContent = null;

        if (aClassContent == null) {
            try {
                throw new NotFoundSymbolError(className, null);
            } catch (NotFoundSymbolError event) {
                event.printErrorMessages();
                System.exit(1);
            }
        }

        String aParentClassName = aClassContent.getParentClassName();
        InstanceContent aParentInstance = null;
        if (aParentClassName != null) {
            aParentInstance = new InstanceContent(aParentClassName, aDataManager);
            this.aParentClassName = aParentClassName;
        }

        HashMap<String, MemberContent> members = new HashMap<>();
        HashMap<String, MemberContent> aMemberTemplates = new HashMap<>(aClassContent.getMembers());
        for (Map.Entry<String, MemberContent> entry : aMemberTemplates.entrySet()) {
            members.put(entry.getKey(), entry.getValue().clone());
        }

        if (aParentInstance != null) members.putAll(aParentInstance.getMembers());
        members.put(className + "-self", new MemberContent("self", className, "private", "none", this));
        members.put(className + "-super", new MemberContent("super", className, "private", "none", aParentInstance));

        this.aClassName = className;
        this.aMembers = members;
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

    public UolVisitor execute(String message, ArrayList<Object> arguments, UolVisitor aVisitor) throws NotFoundSymbolError {
        return this.execute(message, arguments, aVisitor.getDataManager());
    }

    public UolVisitor execute(String message, ArrayList<Object> arguments, DataManager aDatamanager) throws NotFoundSymbolError {
        MessageContent aMessage = aDatamanager.searchMessage(this.aClassName, message);

        // メッセージが未定義の場合
        if (aMessage == null) {
            // 未定義であったが、コンストラクタの場合は正常として進める。
            if (ClassContent.CONSTRUCT_METHOD.equals(message)) {
                return null;
            }
            throw new NotFoundSymbolError(message, null);
        }

        return aMessage.execute(arguments, aDatamanager);
    }

    public HashMap<String, MemberContent> getValuesMap() {
        return this.aMembers;
    }

    public InstanceContent value(DataManager aDataManager) {
        return this;
    }

    public String toString() {
        return this.aClassName + "Instance (by uol)";
    }

    private boolean equalsMembers(Map<String, MemberContent> anOtherMember) {
        Iterator<String> anIterator = this.aMembers.keySet().iterator();
        String aKey;

        while (anIterator.hasNext()) {
            aKey = anIterator.next();
            // 再起ループに陥り、抜けられなくなるパターンを除外する
            if (aKey.equals(this.aClassName + "-self") ||
                    aKey.equals(this.aClassName + "-super") ||
                    aKey.equals(this.aParentClassName + "-self") ||
                    aKey.equals(this.aParentClassName + "-super")) {
                continue;
            }

            Object aFirst = this.aMembers.get(aKey).getValue();
            Object aSecond = anOtherMember.get(aKey).getValue();

            if (aFirst == null && aSecond == null) continue;

            if (!aFirst.equals(aSecond)) return false;
        }
        return true;
    }

    public boolean equals(Object anObject) {
        if (anObject == null) return false;
        if (anObject == this) return true;
        if (anObject instanceof InstanceContent anOther) {
            return this.aClassName.equals(anOther.getClassName())
                    && this.equalsMembers(anOther.getMembers());
        }
        return false;
    }

    public int hashCode() {
        return this.aClassName.hashCode() + this.aMembers.hashCode();
    }
}
