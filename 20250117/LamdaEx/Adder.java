package LamdaEx;
// 구현체 클래스를 따로 생성하는 불편함
class Adder implements BinaryOp {
    public int apply(int left, int right) {
        return left + right;
    }
}