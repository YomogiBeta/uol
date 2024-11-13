package ksu.yomogi.vm.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class PrimitiveMemberCallError extends UolRuntimeError{

    public PrimitiveMemberCallError(String aMemberName, ParserRuleContext context) {
        super( "primitive member " + aMemberName + " see error." ,context);
    }
}
