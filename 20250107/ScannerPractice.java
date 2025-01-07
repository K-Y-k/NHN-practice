import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();              // nextLine()은 문자를 읽는다.
        System.out.printf("Hello, %s", name);


        System.out.println();
        

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = Integer.parseInt(sc2.nextLine()); // 문자를 숫자로 변환
        int j = Integer.parseInt(sc2.nextLine());

        System.out.printf("Hello, %s", i + 1);

        int k = i / j;
        System.out.println(k);


        sc.close();
        sc2.close();
    }
}