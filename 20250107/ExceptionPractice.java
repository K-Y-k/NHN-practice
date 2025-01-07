import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
        // ���� ó�� ����
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");

            int i = Integer.parseInt(sc.nextLine());
            int j = Integer.parseInt(sc.nextLine());

            int k = i / j;

            System.out.println(k);
            sc.close();
        } 
        catch(NumberFormatException e) { // ���ڸ� �Է����� ���� ����� ���� ó��
            System.out.println("Please enter a digit");
        } 
        catch(ArithmeticException e) {   // 0���� ������ ����� ��� ���� ó��
            System.out.println("can't divide by zero");
        }
        catch(RuntimeException e) {      // ��� ������ ���� ó��
            System.out.println("Error");
        }
    }
}
