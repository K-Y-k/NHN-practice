class A {
    void a() {
        System.out.println("A");
    }
}

class B extends A {
    void a() {
        System.out.println("B");
    }
}

class C extends B {
    void a() {
        System.out.println("C");
    }
}

class D extends C {
    void a() {
        System.out.println("D");
    }
}

public class PolymorphicTransformation {
    public static void main(String[] args) {
        D d = new D();
        A a = (A)d;
        B b = (B)a;
        C c = (C)b;

        // 결국 생성된 인스턴스는 D이고
        // 오버라이딩은 자식부터 순차적으로 실행되므로
        // D에서 구현된 메소드가 실행된다.
        a.a();
        b.a();
        c.a();
    }
}
