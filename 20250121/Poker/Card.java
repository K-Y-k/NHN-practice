public class Card {
    private Kinds kind;
    private CardRank cardRank;

    public Card(String kind, String cardRank) {
        this.kind = Kinds.valueOf(kind);
        this.cardRank = CardRank.valueOf(cardRank);

    }

    public CardRank getCardRank() {
        return cardRank;
    }
    public Kinds getKind() {
        return kind;
    }

    @Override
    public String toString() {
        return kind + " " + cardRank;
    }
}
