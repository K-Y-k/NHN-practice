public class LineToken extends Token {
    public LineToken() {
        super();
    }

    @Override
    String accept(TokenVisitor visitor) {
        return visitor.visit(this);
    }
}
