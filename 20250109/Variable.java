public class Variable {
    // 전역 변수: 클래스명.변수명으로 호출 가능
    static int i = 5;

    public static void doSomething() {
        // 공유 변수: 전역 변수를 지역 메소드 내에 사용한 변수
        System.out.println(i); // 5
    }

    public static void main(String[] args) {
        // 공유 변수: 전역 변수를 지역 메소드 내에 사용한 변수
        System.out.println(i); // 5

        // 지역 변수: 메소드 내에서만 유효하다.
        int i = 0;

        System.out.println(i); // 5
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(Variable.i);
    }
}