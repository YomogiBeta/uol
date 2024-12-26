package ksu.yomogi.vm;

import ksu.yomogi.parser.uolLexer;
import ksu.yomogi.parser.uolParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.InputStream;

final public class UolVirtualMachine extends Object {

    public static void main(String[] args) {
        UolVisitor aVisitor = new UolVisitor();
        aVisitor.init();
        try {
            UolVirtualMachine.execute(CharStreams.fromFileName(args[0]), aVisitor);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static UolVisitor execute(InputStream aStream) {
        try {
            return UolVirtualMachine.execute(CharStreams.fromStream(aStream), new UolVisitor());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static UolVisitor execute(String aPath) {
        try {
            return UolVirtualMachine.execute(CharStreams.fromFileName(aPath), new UolVisitor());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static UolVisitor execute(CharStream aStream, UolVisitor aVisitor) {
        uolLexer aLexer = new uolLexer(aStream);
        CommonTokenStream tokens = new CommonTokenStream(aLexer);
        uolParser aParser = new uolParser(tokens);
        aVisitor.visit(aParser.prog());
        return aVisitor;
    }
}
