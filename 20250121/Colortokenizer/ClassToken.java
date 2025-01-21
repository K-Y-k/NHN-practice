public class ClassToken extends Token {
    public ClassToken(String word) {
        super(word);
    }

    @Override
    public String accept(TokenVisitor visitor) {
        return visitor.visit(this);
    }
}
