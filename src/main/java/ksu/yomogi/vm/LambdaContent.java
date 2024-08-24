package ksu.yomogi.vm;

import ksu.yomogi.parser.uolParser;
import ksu.yomogi.vm.errors.MissingArgumentsError;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class LambdaContent extends Object {

    private LinkedHashMap<String, Object> aVariableMap = null;
    private Integer anArgumentsCount = 0;
    private Integer aDefaultArgumentsCount = 0;
    private uolParser.ExpressionListContext aRunnableContext = null;

    public LambdaContent(LinkedHashMap<String, Object> aVariableMap, Integer aDefaultArgumentDefineCount, uolParser.ExpressionListContext aRunnableContext) {
        if (aVariableMap == null) {
            aVariableMap = new LinkedHashMap<>();
        }
        this.aVariableMap = aVariableMap;
        this.aDefaultArgumentsCount = aDefaultArgumentDefineCount;
        this.aRunnableContext = aRunnableContext;

        this.anArgumentsCount = this.aVariableMap.size() - this.aDefaultArgumentsCount;
    }

    public UolVisitor execute() throws MissingArgumentsError {
        if (this.anArgumentsCount != 0) {
            throw new MissingArgumentsError(this.anArgumentsCount, null);
        }
        UolVisitor aVisitor = new UolVisitor();
        aVisitor.visitExpressionList(aRunnableContext);
        return aVisitor;
    }

    public UolVisitor execute(ArrayList<Object> anArguments) throws MissingArgumentsError {
        if (this.anArgumentsCount != anArguments.size()) {
            throw new MissingArgumentsError(this.anArgumentsCount, anArguments.size(), null);
        }
        UolVisitor aVisitor = new UolVisitor();
        AtomicReference<Integer> anIndex = new AtomicReference<>(0);
        aVariableMap.sequencedKeySet().forEach((aKey) -> {
            aVariableMap.replace(aKey, anArguments.get(anIndex.get()));
            anIndex.getAndSet(anIndex.get() + 1);
        });
        aVisitor.setVariableMap(aVariableMap);
        aVisitor.visitExpressionList(aRunnableContext);
        return aVisitor;
    }
}
