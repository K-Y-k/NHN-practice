package VisitorPattern2;
/* 
 * 인터페이스
 * 동작에 대한 타입 정의할 때
 */
public interface TokenVisitor {
    String visit(Token token);
    String visit(ClassToken token);
    String visit(NullToken token);
    String visit(KeywordToken token);
    String visit(LineToken token);
}

class ClassTokenVisitor implements TokenVisitor {
    public String visit(Token acceptor) {
        return "";
    }

    public String visit(ClassToken acceptor) {
        return "<font color='blue'>" + acceptor.getWord() + "</font>";
    }

    public String visit(NullToken acceptor) {
        return acceptor.getWord();
    }

    public String visit(KeywordToken acceptor) {
        return "<font color='green'>" + acceptor.getWord() + "</font>";
    }

    public String visit(LineToken acceptor) {
        return "</br>";
    }
}