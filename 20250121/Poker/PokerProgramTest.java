import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PokerProgramTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playerCount = 0;
        boolean playerCountCheck = true;

        /* Check playerCount */
        while (playerCountCheck) {
            try {
                System.out.print("Enter player count: ");
                playerCount = Integer.parseInt(sc.nextLine());

                if (playerCount < 2 || playerCount > 5) {
                    System.out.println("playerCount Must be between 2 and 5");
                    continue;
                }

            } catch (NumberFormatException e) {
                throw new NumberFormatException("Please enter number 2 ~ 5");
            }

            playerCountCheck = false;
        }

        /* Check userName */
        System.out.print("Enter your name: ");
        String inputUserName = sc.nextLine();
        System.out.println();

        /* Construt deck and shuffle */
        Deck deck = new Deck();
        deck.shuffle();

        /* Construt user and computer */
        List<User> userList = new ArrayList<>();

        for (int i = 0; i < playerCount; i++) {
            String userName = "";

            if (i == 0) {
                userName = inputUserName;
            } else {
                userName = getRandomName();
            }

            userList.add(new User(userName, deck));
        }
        
        /* sort combinationRank */
        Collections.sort(userList, Collections.reverseOrder(new CombinationCoparator()));

        /* Print user Rank */
        String winner = "";
        for (int i = 0; i < userList.size(); i++) {
            if (i == 0) {
                winner = userList.get(i).getUserName();
            }

            System.out.print((i + 1) + "Rank: ");
            System.out.println(userList.get(i));
            System.out.println();
        }

        System.out.println("First-place winner is " + winner + ", Congratulations!");
        System.out.println("Got all the betting money.");

        sc.close();
    }


    /* Get random name */
    public static String getRandomName() {
        Random random = new Random();
        int length = random.nextInt(5);

        StringBuilder name = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i <= length; i++) {
            int index = random.nextInt(characters.length());
            name.append(characters.charAt(index));
        }

        return name.toString();
    }
}
