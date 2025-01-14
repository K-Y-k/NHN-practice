class Hero {}
class IronMan extends Hero implements Flyable {}
class Hulk extends Hero {}

interface Flyable {}

public class SuperSubSample {
    public static void main(String[] args) {
        // 자식 -> 부모 소속
        IronMan iron = new IronMan();
        System.out.println(iron instanceof Hero);

        // 모든 객체는 Object 소속
        System.out.println(iron instanceof Object);

        // 인스턴스 상속도 마찬가지
        System.out.println(iron instanceof Flyable);
    }
}
