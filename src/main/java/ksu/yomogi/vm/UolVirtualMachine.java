package ksu.yomogi.vm;

import ksu.yomogi.parser.uolLexer;
import ksu.yomogi.parser.uolParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class UolVirtualMachine extends Object {

    public static void main(String[] args) throws IOException {
        UolVirtualMachine aMachine = new UolVirtualMachine();
        aMachine.execute(args[0]);
    }

    public UolListener execute(String aPath) throws IOException {
        ANTLRFileStream aStream = new ANTLRFileStream(aPath);
        uolLexer aLexer = new uolLexer(aStream);
        CommonTokenStream tokens = new CommonTokenStream(aLexer);
        uolParser aParser = new uolParser(tokens);
        UolListener aListener = new UolListener();
        aParser.addParseListener(aListener);
        aParser.prog();
        return aListener;
    }
}
