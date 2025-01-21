public interface Visitor {
    String visit(Token token);
    String visit(NullToken token);
    String visit(ClassToken token);
    String visit(LineToken token);
    String visit(TabToken token);
}

class TokenVisitor implements Visitor {
    @Override
    public String visit(Token token) {
        return "";
    }

    @Override
    public String visit(NullToken token) {
        return token.getWord();
    }

    @Override
    public String visit(ClassToken token) {
        return "<span style='color:blue'>" + token.getWord() + "</span>";
    }

    @Override
    public String visit(LineToken token) {
        return "<br>";
    }

    @Override
    public String visit(TabToken token) {
        return "&nbsp;&nbsp;&nbsp;&nbsp;";
    }
}
