import java.util.Random;
import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        // Initialization
        String[][] boards = {{" "," "," "},
                             {" "," "," "},
                             {" "," "," "}};
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int x = 0;
        int y = 0;
        int turnCount = 1;

        // total 9 Loop
        while (turnCount <= 9) {
            // player Turn
            if (turnCount % 2 == 1) {
                try {
                    System.out.print("Enter x, y: ");
                    String input = sc.nextLine();
                    String[] xy = input.split(", ");
                    
                    x = Integer.parseInt(xy[0]);
                    y = Integer.parseInt(xy[1]);

                    // exception case
                    if (boards[x][y] == "O" || boards[x][y] == "X") {
                        throw new IllegalAccessException("이미 마크가 된 좌표입니다. 다시 입력해주세요.");
                    }

                    boards[x][y] = "O";
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }
            else { // computer Turn
                System.out.println("Computer Turn");

                // Get random x y
                while (true) {
                    x = random.nextInt(3);
                    y = random.nextInt(3);

                    if (boards[x][y] != "O" && boards[x][y] != "X") {
                        break;
                    }
                }

                boards[x][y] = "X";
            }

            // Print boards
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(boards[i][j]);

                    if (j == 2) {
                        System.out.print("\n");
                        continue;
                    }

                    System.out.print(" | ");
                }
                
                if (i == 2) {
                    break;
                }
                System.out.println("----------");
            }

            System.out.println();


            // width, height, diagonal Dinstiction 
            if (checkLine(boards)) {
                if (turnCount % 2 == 1) {
                    System.out.println("You Win");
                } else {
                    System.out.println("Computer Win");
                }

                break;
            }

            // turn Counting
            turnCount++;
        }


        // All loop search = draw case
        if (turnCount == 10) {
            System.out.println("draw");
        }

        sc.close();
    }

    // width, height, diagonal Dinstiction Function 
    static boolean checkLine(String[][] boards) {
        // width
        for (int i = 0; i < 3; i++) {
            if (boards[i][0] != " ") {
                if (boards[i][0] == boards[i][1] && boards[i][0] == boards[i][2]) {
                    return true;
                }
            }
        }

        // height
        for (int i = 0; i < 3; i++) {
            if (boards[0][i] != " ") {
                if (boards[0][i] == boards[1][i] && boards[0][i] == boards[2][i]) {
                    return true;
                }
            }
        }

        // diagonal
        if (boards[0][0] != " " && boards[0][0] == boards[1][1] && boards[0][0] == boards[2][2]) {
            return true;
        }
        if (boards[0][2] != " " && boards[0][2] == boards[1][1] && boards[0][2] == boards[2][0]) {
            return true;
        }

        // Not width and height and diagonal
        return false;
    }
}