public class RecursiveFunction2 {
    // 팩토리얼
    public static int factorial(int n) {
        if (n < 1) {
            return 1;
        }

        System.out.println(n);
        return n * factorial(n-1);
    }

    // 유클리드 알고리즘 활용한 최대 공약수
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
