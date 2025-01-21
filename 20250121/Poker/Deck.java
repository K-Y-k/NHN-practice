import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Deck {
     static ArrayList<Card> cards = new ArrayList<>();
     static Stack<Card> shuffleDeck = new Stack<>();

     public Deck() {
          String[] kinds = {"DIAMOND", "SPADE", "HEART", "CLOVER"};
          String[] cardRanks = {"TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "J", "Q", "K", "A"};

          // construct 52 cards
          for (int i = 0; i < 4; i++) {
               for (int j = 0; j < 13; j++) {
                    cards.add(new Card(kinds[i], cardRanks[j]));
               }
          }
     }

     public void shuffle() {
          Random random = new Random();

          for (int i = 51; i >= 0; i--) {
               Card removeCard = cards.remove(random.nextInt(i+1));
               shuffleDeck.add(removeCard);
          }
     }

     public Card draw() {
          return shuffleDeck.pop();
     }

     public void printCards() {
          for (Card card: cards) {
               System.out.print(card.getKind() + " " + card.getCardRank() + ", ");
          }

          System.out.println();

          System.out.println(shuffleDeck.size());
     }

     public void printShuffleCards() {
          for (Card card: shuffleDeck) {
               System.out.print(card.getKind() + " " + card.getCardRank() + ", ");
          }

          System.out.println();

          System.out.println(shuffleDeck.size());
     }
}
