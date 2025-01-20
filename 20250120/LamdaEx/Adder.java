// 더하기 구현체 클래스를 만든 방식 -> 클래스를 따로 생성해야 하는 불편함
public class Adder implements BinaryOp {
    public int apply(int i, int j) {
        return i + j;
    }
}
