package ksu.yomogi.vm.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class NativeMemberCallError extends UolRuntimeError{

    public NativeMemberCallError(String aMemberName, ParserRuleContext context) {
        super( "native member " + aMemberName + " see error." ,context);
    }
}
