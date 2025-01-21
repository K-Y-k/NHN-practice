public enum Kinds {
    DIAMOND("DIAMOND", 4),
    SPADE("SPADE", 3),
    HEART("HEART", 2),
    CLOVER("CLOVER", 1);

    private final int kindValue;

    Kinds(String name, int kindValue) {
        this.kindValue = kindValue;
    }

    public int getKindValue() {
        return kindValue;
    }
}
