public class RecursiveFunction2 {
    // ���丮��
    public static int factorial(int n) {
        if (n < 1) {
            return 1;
        }

        System.out.println(n);
        return n * factorial(n-1);
    }

    // ��Ŭ���� �˰��� Ȱ���� �ִ� �����
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }
}
