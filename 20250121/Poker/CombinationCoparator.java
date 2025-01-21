import java.util.ArrayList;
import java.util.Comparator;

public class CombinationCoparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
         /* Check 1.cardCombination */
        if (u1.getCardCombination().getRank() == u2.getCardCombination().getRank()) {
            ArrayList<Card> u1Cards = u1.getCombiantionCards();
            ArrayList<Card> u2Cards = u2.getCombiantionCards();
            int length = u1.getCombiantionCards().size();

            for (int i = length-1; i >= 0; i--) {
                /* Check 2.cardRank */
                if (u1Cards.get(i).getCardRank() != u2Cards.get(i).getCardRank()) {
                    return u1Cards.get(i).getCardRank().getRankValue() - u2Cards.get(i).getCardRank().getRankValue();
                }

                /* Check 3.cardKinds */
                if (u1Cards.get(i).getKind().getKindValue() != u2Cards.get(i).getKind().getKindValue()) {
                    return u1Cards.get(i).getKind().getKindValue() - u2Cards.get(i).getKind().getKindValue();
                }
            }
        }

        return u1.getCardCombination().getRank() - u2.getCardCombination().getRank();
    }
}
