import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        // 예외 처리 구문
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");

            int i = Integer.parseInt(sc.nextLine());
            int j = Integer.parseInt(sc.nextLine());

            int k = i / j;

            System.out.println(k);
            sc.close();
        } 
        catch(NumberFormatException e) { // 숫자를 입력하지 않은 경우의 예외 처리
            System.out.println("Please enter a digit");
        } 
        catch(ArithmeticException e) {   // 0으로 나누는 경우의 산술 예외 처리
            System.out.println("can't divide by zero");
        }
        catch(RuntimeException e) {      // 모든 에러의 예외 처리
            System.out.println("Error");
        }
    }
}
