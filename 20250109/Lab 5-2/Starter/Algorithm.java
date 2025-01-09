public class Algorithm {
    // 상수로 선언
    static int addFrom1To10 = 55; 

    // 1~10 합 메서드 -> 항상 같은 값을 가지므로 상수로 선언이 낫다.
    public static int addFrom1ToN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }   


    //
    // sigma method
    //
    public static int sigma(int start, int end, int step) {
        return accumulate(new Adder(), 0, start, end, step);
    }

    //
    // pi method here
    //
    public static int pi(int start, int end, int step) {
        return accumulate(new Multiplier(), 1, start, end, step);
    }

    //
    // accumulate method
    //
    public static int accumulate(Adder binder, int init, int start, int end, int step) {
        int result = init;
        
        for (int i = start; i <= end; i+= step) {
            result = binder.apply(i, result);
        }

        return result;
    }

    //
    // overloaded accumulate method
    //
    public static int accumulate(Multiplier binder, int init, int start, int end, int step) {
        int result = init;
        
        for (int i = start; i <= end; i+= step) {
            result = binder.apply(i, result);
        }

        return result;
    }


    public static void main(String[] args) {
        int result = addFrom1ToN(10);
        System.out.println(result);

        int result2 = sigma(1, 10, 1);
        System.out.println(result2);

        int result3 = pi(1, 10, 1);
        System.out.println(result3);
    }
}