package ksu.yomogi.vm.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class NativeMethodCallError extends UolRuntimeError{

    public NativeMethodCallError(String aMethodName, ParserRuleContext context) {
        super( "native message " + aMethodName + " called error." ,context);
    }
}
