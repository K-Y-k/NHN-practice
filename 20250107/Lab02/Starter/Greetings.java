import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        String myName; // ���� ����
        String name = "";

        System.out.print("Enter your name: ");
        
        Scanner sc = new Scanner(System.in);
        myName = sc.nextLine();

        System.out.printf("Greetings, [%s]", myName);
        
        sc.close(); // �̷� Ŭ������ �����ϸ� �ڵ����� �ݾ������� 
                    // db, ���� ���� ������ �ʼ��� �ݾ��־�� �Ѵ�.
    }
}