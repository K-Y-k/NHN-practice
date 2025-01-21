public class NullToken extends Token {
    public NullToken(String s) {
        super(s);
    }

    @Override
    String accept(TokenVisitor visitor) {
        return visitor.visit(this);
    }
}
