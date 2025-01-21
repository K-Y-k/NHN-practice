public enum CardCombination {
    STRAIGHT_FLUSH("STRAIGHT_FLUSH", 9),
    FOUR_OF_A_KIND("FOUR_OF_A_KIND", 8),
    FULL_HOUSE("FULL_HOUSE", 7),
    FLUSH("FLUSH", 6),
    STRAIGHT("STRAIGHT", 5),
    THREE_OF_A_KIND("THREE_OF_A_KIND", 4),
    TWO_PAIR("TWO_PAIR", 3),
    ONE_PAIR("ONE_PAIR", 2),
    HIGH_CARD("HIGH_CARD", 1);

    private final int rank;

    CardCombination(String name, int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
