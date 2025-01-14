class A {}

class B extends A {}
class D extends B {}
class E extends B {}

class C extends A {}
class F extends C {}
class G extends C {}

public class SuperAndSubClass {
    public static void main(String[] args) {
        // 자식 인스턴스 -> 부모 인스턴스로 변환 O
        G g = new G();
        C c = g;
        A a = g;

        D d = new D();
        a = d;

        E e = new E();
        a = e;


        // 부모 인스턴스 -> 자식 인스턴스로 변환 가능은 하지만
        //                  자식 참조를 받은 부모 인스턴스인 경우만 가능
        
        // A 부모 인스턴스로 생성했으므로 에러
        // A a2 = new A();
        // java.lang.ClassCastException: class A cannot be cast to class C 
        
        // C c2 = (C)a2;
        // D d2 = (D)a2;
    }
}
