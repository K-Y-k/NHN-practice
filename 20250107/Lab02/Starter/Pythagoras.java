import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Enter y: ");
        int b = Integer.parseInt(sc.nextLine());

        int result = pythagorasCal(a, b);

        System.out.println("result = " + result);
    }

    /**
     * 피타고라스 계산 메서드
     */
    public static int pythagorasCal(int a, int b) {
        // a^2
        int aPow = a * a;

        // b^2
        int bPow = b * b;

        // c^2 = a^2 + b^2
        return (int) Math.sqrt(aPow + bPow);
    }
}
