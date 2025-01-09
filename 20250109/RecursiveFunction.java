public class RecursiveFunction {
    // Ãâ·Â
    public static int add(int n) {
        if (n < 1) {
            return n;
        }

        System.out.println(n);
        return add(n-1);
    }

    // ÃÑ ÇÕ
    public static int sum(int n) {
        if (n < 1) {
            return n;
        }
        
        return n + sum(n-1);
    }
    
    public static void main(String[] args) {
        add(10);

        System.out.println();

        int result = sum(10);
        System.out.println(result);
    }
}
