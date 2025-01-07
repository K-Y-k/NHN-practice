import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        String myName; // 변수 선언
        String name = "";

        System.out.print("Enter your name: ");
        
        Scanner sc = new Scanner(System.in);
        myName = sc.nextLine();

        System.out.printf("Greetings, [%s]", myName);
        
        sc.close(); // 이런 클래스는 사용안하면 자동으로 닫아주지만 
                    // db, 파일 등의 연결은 필수로 닫아주어야 한다.
    }
}