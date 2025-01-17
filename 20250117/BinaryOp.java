@FunctionalInterface // 컴파일 할 때 구분하기 위한 어노테이션
// 함수형 인터페이스 -> 추상 메소드가 오직 하나만 들어있는 것
public interface BinaryOp {
    int apply(int i, int j);
}

// 인터페이스를 상속 받아서 구현하는 일반적인 방식
// -> 일일히 클래스로 만들어야 하는 불편함
class Adder implements BinaryOp {
    public int apply(int i, int j) {
        return i + j;
    }
}


class Test {
    // 자바는 타입만 받을 수 있어 BinaryOp 타입으로 받아옴
    public static int calc(BinaryOp binder, int i, int j) {
        return binder.apply(i, j);
    }

    public static void main(String[] args) {
        // 익명 클래스 방식 가능
        // 타입 이름이 없고 adder라는 인스턴스만 만들고 있다.
        BinaryOp mult = new BinaryOp() {
            public int apply(int i, int j) {
                return i * j;
            }
        };

        // 구현 했던 클래스인 Adder 구현 객체를 타입으로 넘김
        int a = calc(new Adder(), 1, 3);

        // 익명 클래스로 생성한 객체를 타입으로 넘김
        int b = calc(mult, 1, 3);


        // 객체 타입으로 전달하지 않고 함수 타입으로 전달하려면?
        // -> 
        int c = calc((x, y) -> x * y, a, b);


    }
}