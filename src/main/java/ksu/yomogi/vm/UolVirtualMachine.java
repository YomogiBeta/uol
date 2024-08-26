package ksu.yomogi.vm;

import ksu.yomogi.parser.uolLexer;
import ksu.yomogi.parser.uolParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class UolVirtualMachine extends Object {

    public static void main(String[] args) {
        UolVirtualMachine.execute(args[0]);
    }

    public static UolVisitor execute(String aPath) {
        try {
            ANTLRFileStream aStream = new ANTLRFileStream(aPath);
            uolLexer aLexer = new uolLexer(aStream);
            CommonTokenStream tokens = new CommonTokenStream(aLexer);
            uolParser aParser = new uolParser(tokens);
            UolVisitor aVisitor = new UolVisitor();
            aVisitor.visit(aParser.prog());
            return aVisitor;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
