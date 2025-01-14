public class Singleton {
    private int accountNo = 0;
    static Singleton singleton;

    // 생성자를 막는다.
    private Singleton() {
    }

    public int getNextNumber() {
        return this.accountNo++;
    }

    // 한번만 생성되도록 하는 함수
    public static Singleton getSingleton() {
        // 한번도 생성되지 않은 경우
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;
    }
}

class Test2 {
    public static void main(String[] args) {
        Singleton s = Singleton.getSingleton();
        System.out.println(s);
    }
}
