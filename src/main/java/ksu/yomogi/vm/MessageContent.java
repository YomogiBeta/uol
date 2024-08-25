package ksu.yomogi.vm;

public class MessageContent extends Object {

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
