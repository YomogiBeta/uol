package ksu.yomogi.vm.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class PrivateMemberCallError extends UolRuntimeError{

    public PrivateMemberCallError(String aMemberName, ParserRuleContext context) {
        super( "private member " + aMemberName + " see error." ,context);
    }
}
