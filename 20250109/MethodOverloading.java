public class MethodOverloading {
    static int max(int i, int j) {
        return (i > j) ? i :j;
    }

    // �޼ҵ� �����ε�
    // �Ķ������ ������ Ÿ�԰� �ٸ��� ���� �̸��� ���� �޼ҵ� ��밡��
    static int max(int i, int j, int k) {
        return max(max(i, j), k);
    }

    static void print(int i) {
        System.out.println(i);
    }
    static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        max(1, 2, 3);
    }
}
