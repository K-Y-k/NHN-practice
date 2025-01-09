public class Method {
    // static이 붙어서 고정된다.
    static int i = 0;

    public static void method1() {
        System.out.println("Method 1");
    }


    // static이 없어 Method 클래스의 메소드로 즉시 호출이 불가능하다.
    public void method2() {
        System.out.println("Method 2");
    }

    public static void main(String[] args) {
        // static이 붙은 메소드 호출
        method1();
        
        
        // static이 붙지 않은 메소드 호출
        Method m = new Method();
        m.method2();
    }
}