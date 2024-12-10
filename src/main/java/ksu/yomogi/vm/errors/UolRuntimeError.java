package ksu.yomogi.vm.errors;

import org.antlr.v4.runtime.ParserRuleContext;

public class UolRuntimeError extends RuntimeException {

    private ParserRuleContext aContext;

    /**
     * コンストラクトメソッド
     * @param message エラーメッセージ
     * @param context エラーが発生したコンテキスト
     */
    public UolRuntimeError(String message, ParserRuleContext context) {
        super(message);
        this.aContext = context;
    }

    /**
     * コンストラクトメソッド
     * @param message  エラーメッセージ
     * @param cause   エラーの原因
     * @param context エラーが発生したコンテキスト
     */
    public UolRuntimeError(String message, Throwable cause, ParserRuleContext context) {
        super(message, cause);
        this.aContext = context;
    }

    /**
     * コンストラクトメソッド
     * @param cause  エラーの原因
     * @param context エラーが発生したコンテキスト
     */
    public UolRuntimeError(Throwable cause, ParserRuleContext context) {
        super(cause);
        this.aContext = context;
    }

    /**
     * エラーが発生したコンテキストを設定するメソッド
     * @param context エラーが発生したコンテキスト
     */
    public void setContext(ParserRuleContext context) {
        this.aContext = context;
    }

    /**
     * 実行エラーを出力するメソッド
     */
    public void printErrorMessages() {
        StringBuffer aBuffer = new StringBuffer();
        aBuffer.append("Error: ");
        aBuffer.append(this.getMessage());
        aBuffer.append(System.lineSeparator());
        aBuffer.append("Line: ");
        aBuffer.append(this.aContext.getStart().getLine());
        aBuffer.append(System.lineSeparator());
        aBuffer.append("Code: ");
        this.aContext.children.forEach((aChild) -> {
            aBuffer.append(aChild.getText());
            aBuffer.append(" ");
        });
        System.err.println(aBuffer.toString());
    }
}
