import java.util.ArrayList;
import java.util.Collections;

public class User {
    private String userName;
    private CardCombination cardCombination;

    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Card> combiantionCards = new ArrayList<>();

    public User(String name, Deck deck) {
        userName = name;

        for (int i = 0; i < 5; i++) {
            Card drawCard = deck.draw();
            cards.add(drawCard);
        }

        Collections.sort(cards, new CardRankComparator());
        cardCombination = cardCombination();
    }

    public String getUserName() {
        return userName;
    }
    public CardCombination getCardCombination() {
        return cardCombination;
    }
    public ArrayList<Card> getCards() {
        return cards;
    }
    public ArrayList<Card> getCombiantionCards() {
        return combiantionCards;
    }



    private CardCombination cardCombination() {
        // Straight Flush
        if (cards.get(0).getKind() == cards.get(1).getKind()
            && cards.get(0).getKind() == cards.get(2).getKind()
            && cards.get(0).getKind() == cards.get(3).getKind()
            && cards.get(0).getKind() == cards.get(4).getKind()) {
                boolean straightFlush = false;

                for (int i = 0; i < cards.size()-1; i++) {
                    if (cards.get(i).getCardRank().getRankValue() + 1 != cards.get(i+1).getCardRank().getRankValue()) {
                        break;
                    }

                    if (i == cards.size()-2) {
                        straightFlush = true;
                    }
                }

                if (straightFlush) {
                    combiantionCards = cards;
                    return CardCombination.STRAIGHT_FLUSH;
                }
        }

        // Four of Kind
        for (int i = 0; i < 2; i++) {
            if (cards.get(i).getCardRank() == cards.get(i+1).getCardRank() 
                && cards.get(i).getCardRank() == cards.get(i+2).getCardRank()
                && cards.get(i).getCardRank() == cards.get(i+3).getCardRank()) {
                if (i == 0) {
                    combiantionCards.add(cards.get(4));
                    combiantionCards.add(cards.get(0));
                    combiantionCards.add(cards.get(1));
                    combiantionCards.add(cards.get(2));
                    combiantionCards.add(cards.get(3));
                } else {
                    combiantionCards = cards;
                }
                
                return CardCombination.FOUR_OF_A_KIND;
            }
        }

        // Full House
        for (int i = 0; i < 3; i++) {
            if (cards.get(i).getCardRank() == cards.get(i+1).getCardRank() 
                && cards.get(i).getCardRank() == cards.get(i+2).getCardRank()) {
            
                if (i == 0 && cards.get(3).getCardRank() == cards.get(4).getCardRank()) {
                    combiantionCards.add(cards.get(3));
                    combiantionCards.add(cards.get(4));

                    combiantionCards.add(cards.get(i));
                    combiantionCards.add(cards.get(i+1));
                    combiantionCards.add(cards.get(i+2));
                    return CardCombination.FULL_HOUSE;
                }
                else if (i == 2 && cards.get(0).getCardRank() == cards.get(1).getCardRank()) {        
                    combiantionCards = cards;
                    return CardCombination.FULL_HOUSE;
                }
            }
        }

        // Flush
        if (cards.get(0).getKind() == cards.get(1).getKind()
            && cards.get(0).getKind() == cards.get(2).getKind()
            && cards.get(0).getKind() == cards.get(3).getKind()
            && cards.get(0).getKind() == cards.get(4).getKind()) {
            
            combiantionCards = cards;
            return CardCombination.FLUSH;
        }

        // Straight
        if (cards.get(0).getCardRank().getRankValue() + 1 == cards.get(1).getCardRank().getRankValue()
            && cards.get(1).getCardRank().getRankValue() + 1 == cards.get(2).getCardRank().getRankValue()
            && cards.get(2).getCardRank().getRankValue() + 1 == cards.get(3).getCardRank().getRankValue()
            && cards.get(3).getCardRank().getRankValue() + 1 == cards.get(4).getCardRank().getRankValue()) {
            
            combiantionCards = cards;
            return CardCombination.STRAIGHT;
        }

        // Triple
        for (int i = 0; i < 3; i++) {
            if (cards.get(i).getCardRank() == cards.get(i+1).getCardRank() 
                && cards.get(i).getCardRank() == cards.get(i+2).getCardRank()) {
                for (Card c : cards) {
                    if (c.getCardRank().getRankValue() != cards.get(i).getCardRank().getRankValue()) {
                        combiantionCards.add(c);
                    }
                }
                combiantionCards.add(cards.get(i));
                combiantionCards.add(cards.get(i+1));
                combiantionCards.add(cards.get(i+2));

                return CardCombination.THREE_OF_A_KIND;
            }
        }

        // Two Pair
        if ((cards.get(0).getCardRank() == cards.get(1).getCardRank()
            && cards.get(2).getCardRank() == cards.get(3).getCardRank())) {
            combiantionCards.add(cards.get(4));
            combiantionCards.add(cards.get(0));
            combiantionCards.add(cards.get(1));
            combiantionCards.add(cards.get(2));
            combiantionCards.add(cards.get(3));

            return CardCombination.TWO_PAIR;
        } else if (cards.get(0).getCardRank() == cards.get(1).getCardRank()
                   && cards.get(3).getCardRank() == cards.get(4).getCardRank()) {
            combiantionCards.add(cards.get(2));
            combiantionCards.add(cards.get(0));
            combiantionCards.add(cards.get(1));
            combiantionCards.add(cards.get(3));
            combiantionCards.add(cards.get(4));

            return CardCombination.TWO_PAIR;
        } else if (cards.get(1).getCardRank() == cards.get(2).getCardRank()
                   && cards.get(3).getCardRank() == cards.get(4).getCardRank()) {
            combiantionCards = cards;
            return CardCombination.TWO_PAIR;
        }

        // One Pair
        for (int i = 0; i < 4; i++) {
            if (cards.get(i).getCardRank() == cards.get(i+1).getCardRank()) {
                for (Card c : cards) {
                    if (c.getCardRank().getRankValue() != cards.get(i).getCardRank().getRankValue()) {
                        combiantionCards.add(c);
                    }
                }
                combiantionCards.add(cards.get(i));
                combiantionCards.add(cards.get(i+1));

                return CardCombination.ONE_PAIR;
            }
        }


        // High Card
        combiantionCards = cards;
        return CardCombination.HIGH_CARD;
    }


    @Override
    public String toString() {
        StringBuilder combinationCardList = new StringBuilder();
        combinationCardList.append("[ ");
        for (int i = combiantionCards.size()-1; i >= 0; i--) {
            combinationCardList.append(combiantionCards.get(i)).append(", ");
        }
        combinationCardList.append("]");

        return userName + "(" + getCardCombination() + ")\n"
                + combinationCardList;
    }
}
