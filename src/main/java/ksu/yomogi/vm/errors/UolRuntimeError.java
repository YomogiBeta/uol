package ksu.yomogi.vm.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class UolRuntimeError extends RuntimeException {

    private ParserRuleContext aContext;

    public UolRuntimeError(String message, ParserRuleContext context) {
        super(message);
        this.aContext = context;
    }

    public UolRuntimeError(String message, Throwable cause, ParserRuleContext context) {
        super(message, cause);
        this.aContext = context;
    }

    public UolRuntimeError(Throwable cause, ParserRuleContext context) {
        super(cause);
        this.aContext = context;
    }

    public void printErrorMessages() {
        StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("Error: ");
        aBuffer.append(this.getMessage());
        aBuffer.append(System.lineSeparator());
        aBuffer.append("Line: ");
        aBuffer.append(this.aContext.getStart().getLine());
        aBuffer.append(System.lineSeparator());
        aBuffer.append("Code: ");
        aBuffer.append(this.aContext.getStart().getText());
        aBuffer.append(" ");
        aBuffer.append(this.aContext.getStop().getText());
        System.err.println(aBuffer.toString());
    }
}
