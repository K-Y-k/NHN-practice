import java.util.function.BinaryOperator;

public class Test2 {
    // 자바에서 제공하는 BinaryOperator 활용
    public static Number calc(BinaryOperator<Number> binder, int i, int j) {
        return binder.apply(i, j);
    }



    public static void main(String[] args) {
        
    }
}
