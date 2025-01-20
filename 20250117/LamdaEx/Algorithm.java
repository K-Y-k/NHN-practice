package LamdaEx;
public class Algorithm {
    static final int addFrom1To10 = 55;
    
    /* 1.클래스 구현체를 만들어서 전달 받는 일반적인 방식 */
    // public static int sigma(int begin, int end, int step) {
    //     return accumulate(new Adder(), 0, begin, end, step); 
    // }

    /* 2.익명 클래스 방식 */
    public static int sigma(int begin, int end, int step) {
        // 모든 인터페이스는 익명 클래스를 만들 수 있다.
        BinaryOp adder = new BinaryOp() {
            // 인터페이스의 추상 메소드 모두 구현하기
            public int apply(int i, int j) {
                return i + j;
            }
        };
        return accumulate(adder, 0, begin, end, step); 
    }

    /* 3.람다식 방식 */
    public static int pi(int begin, int end, int step) {
        // 함수형 인터페이스만 람다식이 가능하다.
        return accumulate((x, y)-> x * y, 1, begin, end, step);
    }

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
    }
}