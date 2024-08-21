package ksu.yomogi.vm.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class NotFoundSymbolError extends UolRuntimeError{

    public NotFoundSymbolError(String symbolName, ParserRuleContext context) {
        super("Not found symbol error: " + symbolName + " is not found.", context);
    }
}
