import PredicateAndConsumerEx.Department;

public class Test4 {

    public static int calc(BinaryOp binder, int i, int j) {
        return binder.apply(i, j);
    }

    // 메소드 참조 방식
    // static 메소드
    public static int add(int i, int j) {
        return i + j;
    }
    // static이 아닌 메소드
    public int add2(int i, int j) {
        return i + j;
    }

    public static void main(String[] args) {
        // 람다식으로 전달 방식
        calc((i, j) -> i + j, 1, 2);

        // 메소드 참조 방식
        // static 메소드인 경우
        calc(Test4::add, 1, 2);

        // static이 아닌 메소드인 경우
        Test4 t = new Test4();
        calc(t::add2, 1, 2);

        Department dep = new Department();

        dep.accept((s) -> System.out.println(s));
        dep.accept(System.out::println);
    }
}
