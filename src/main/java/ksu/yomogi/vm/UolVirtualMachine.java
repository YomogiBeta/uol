package ksu.yomogi.vm;

import ksu.yomogi.parser.uolLexer;
import ksu.yomogi.parser.uolParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

final public class UolVirtualMachine extends Object {

    public static void main(String[] args) {
        UolVisitor aVisitor = new UolVisitor();
        aVisitor.init();
        UolVirtualMachine.execute(args[0], aVisitor);
    }

    public static UolVisitor execute(String aPath) {
        return UolVirtualMachine.execute(aPath, new UolVisitor());
    }

    public static UolVisitor execute(String aPath, UolVisitor aVisitor) {
        try {
            ANTLRFileStream aStream = new ANTLRFileStream(aPath);
            uolLexer aLexer = new uolLexer(aStream);
            CommonTokenStream tokens = new CommonTokenStream(aLexer);
            uolParser aParser = new uolParser(tokens);
            aVisitor.visit(aParser.prog());
            return aVisitor;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
