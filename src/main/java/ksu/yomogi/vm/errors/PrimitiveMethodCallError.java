package ksu.yomogi.vm.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class PrimitiveMethodCallError extends UolRuntimeError{

    public PrimitiveMethodCallError(String aMethodName, ParserRuleContext context) {
        super( "native message " + aMethodName + " called error." ,context);
    }
}
