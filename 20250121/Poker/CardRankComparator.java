import java.util.Comparator;

public class CardRankComparator implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        /* Check 1.cardRank */
        /* Check 2.cardKinds */
        if (c1.getCardRank().getRankValue() - c2.getCardRank().getRankValue() == 0) {
            return c1.getKind().getKindValue() - c2.getKind().getKindValue();
        }

        return c1.getCardRank().getRankValue() - c2.getCardRank().getRankValue();
    }
}
