public enum CardRank {
    A("A", 14), K("K", 13), Q("Q", 12), J("J", 11),
    TEN("TEN", 10), NINE("NINE", 9), EIGHT("EIGHT", 8), SEVEN("SEVEN", 7), SIX("SIX", 6),
    FIVE("FIVE", 5), FOUR("FOUR", 4), THREE("THREE", 3), TWO("TWO", 2);

    private final int rankValue;

    CardRank(String name, int rankValue) {
        this.rankValue = rankValue;
    }

    public int getRankValue() {
        return rankValue;
    }
}
