package ksu.yomogi.vm.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class PrivateMethodCallError extends UolRuntimeError{

    public PrivateMethodCallError(String aMethodName, ParserRuleContext context) {
        super( "private message " + aMethodName + " called error." ,context);
    }
}
