public class SystemMethod {
    public static void main(String[] args) {
        // System.out �޼ҵ�
        double d = 5.0;
        System.out.printf("%f", d); // ��¿� ������ ����
        System.out.println();

        String name = "Celine";
        System.out.print("�ȳ�, ");      // ǥ�� ȭ�� ���
        System.out.println(name);          // ǥ�� ȭ�� ��� + �� �ٲ�

        String message = "�޽��� �����մϴ�.";
        System.out.printf("%s, %s", message, name);
    }
}
