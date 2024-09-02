package ksu.yomogi.vm.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class MissingArgumentsError extends UolRuntimeError{

    public MissingArgumentsError(Integer anArgumentsCount, Integer aRequiredArgumentsCount, ParserRuleContext context) {
        super(anArgumentsCount + " argument is required, but " + aRequiredArgumentsCount + " were specified.", context);
    }
}
