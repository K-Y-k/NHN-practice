public abstract class Token {
    String word;

    public Token() {
    }
    public Token(String word) {
        this.word = word;
    }
    
    public String getWord() {
        return word;
    }
    
    abstract String accept(TokenVisitor visitor);
}
