public class Test {
    // BinaryOp 타입을 받음
    public static int calc(BinaryOp binder, int i, int j) {
        return binder.apply(i, j);
    }

    // 메소드 참조 방식
    public static int plus(int i, int j) {
        return i + j;
    }


    public static void main(String[] args) {
        // 클래스를 생성해야 하여 너무 클래스가 많아지면 유지보수가 힘듬
        Adder adder = new Adder();
        calc(adder, 1, 2);

        
        // 익명 클래스 방식
        // 클래스를 따로 생성해주지 않아도 됨
        // main함수를 벗어나면 사용 못하는 단점 일회성 
        // ex) AWT 이벤트 핸들러
        BinaryOp muti = new BinaryOp() {
            public int apply(int i, int j) {
                return i + j;
            }
        };
        calc(muti, 1, 2);


        // 메소드 참조 방식
        calc(Test::plus, 1, 2);


        // 람다식 방식
        calc((x,y) -> x + y, 1, 2);
    }
}
