public class Algorithm {
    static final int addFrom1To10 = 55;
    
    public static int sigma(int begin, int end, int step) {
        return accumulate(new Adder(), 0, begin, end, step); 
    }

    public static int pi(int begin, int end, int step) {
        return accumulate(new Multiplier(), 1, begin, end, step);
    }

    // static int accumulate(Adder adder, int init, int begin, int end, int step) {
    //     int result = init;
    //     for (int next = begin; next <= end; next = next + step) {
    //         result = adder.apply(result, next);
    //     }
    //     return result;
    // }

    // 인터페이스를 활용하여
    // 같은 메소드명과 같은 반환 타입이지만 내부 다른 동작으로
    // 하나의 메소드 통일이 가능해졌다.
    static int accumulate(BinaryOp binder, int init, int begin, int end, int step) {
        int result = init;
        
        for (int next = begin; next <= end; next = next + step) {
            result = binder.apply(result, next);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sigma(1, 10, 1));
        System.out.println(pi(1, 10, 1));

        System.out.println(accumulate(new Adder(), 0, 1, 10, 1));
        System.out.println(accumulate(new Multiplier(), 0, 1, 10, 1));
    }
}