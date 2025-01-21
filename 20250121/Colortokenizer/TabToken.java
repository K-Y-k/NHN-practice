public class TabToken extends Token {
    public TabToken() {
        super();
    }

    @Override
    String accept(TokenVisitor visitor) {
        return visitor.visit(this);
    }
}
