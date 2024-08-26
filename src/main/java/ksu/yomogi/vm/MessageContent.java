package ksu.yomogi.vm;

import ksu.yomogi.vm.datamanager.DataManager;
import ksu.yomogi.vm.errors.MissingArgumentsError;
import ksu.yomogi.vm.interfaces.Executable;

import java.util.ArrayList;

public class MessageContent extends Object implements Executable {

    private final String aModifier;
    private final String anInstruction;
    private LambdaContent aLambda;

    public MessageContent(String modifier, String instruction, LambdaContent lambda) {
        this.aModifier = modifier;
        this.anInstruction = instruction;
        this.aLambda = lambda;
    }

    public String getModifier() {
        return this.aModifier;
    }

    public String getInstruction() {
        return this.anInstruction;
    }

    public LambdaContent getLambda() {
        return this.aLambda;
    }

    public UolVisitor execute() throws MissingArgumentsError {
        return this.execute(new ArrayList<>(), null);
    }

    public UolVisitor execute(ArrayList<Object> anArguments) throws MissingArgumentsError {
        return this.aLambda.execute(anArguments, null);
    }

    public UolVisitor execute(ArrayList<Object> anArguments, DataManager aDataManager) throws MissingArgumentsError {
        return this.aLambda.execute(anArguments, aDataManager);
    }

    public String toString() {
        String aString = "{ " + this.aModifier + " " + this.anInstruction + " } ";
        return aString + "Message";
    }

    public boolean equals(Object obj) {
        if (obj instanceof MessageContent anOther) {
            return this.aLambda.equals(anOther.getLambda())
                    && this.aModifier.equals(anOther.getModifier())
                    && this.anInstruction.equals(anOther.getInstruction());
        }
        return false;
    }

    public int hashCode() {
        return (this.aLambda.hashCode() + this.aModifier.hashCode() + this.anInstruction.hashCode()
        );
    }
}
