package VisitorPattern2;
/* 
 * 추상 클래스
 * 객체의 틀을 정의할 때
 */
public abstract class Token {
    String word;

    /**
     * @param word Token 객체가 표현하는 문자열을 의미합니다.
     */
    public Token(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    /**
     * @param visitor : 동작을 수행하는 Double Dispatcher 객체
     */
    abstract String accept(TokenVisitor visitor);
}

class ClassToken extends Token {
    public ClassToken(String word) {
        super(word);
    }

    public String accept(TokenVisitor visitor) {
        return visitor.visit(this);
    }
}

class NullToken extends Token {
    public NullToken(String word) {
        super(word);
    }

    public String accept(TokenVisitor visitor) {
        return visitor.visit(this);
    }
}

class KeywordToken extends Token {
    public KeywordToken(String word) {
        super(word);
    }

    public String accept(TokenVisitor visitor) {
        return visitor.visit(this);
    }
}

class LineToken extends Token {
    public LineToken(String word) {
        super(word);
    }

    public String accept(TokenVisitor visitor) {
        return visitor.visit(this);
    }
}
