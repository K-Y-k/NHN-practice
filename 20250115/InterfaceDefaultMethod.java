interface Printable {
    int returnAsInt();

    // default 메소드를 사용하면 
    // 사용하지 않는 메소드를 인터페이스에서 default로 구현하여 
    // 사용하지 않는 클래스에서 구현을 강제할 필요가 없어 
    // 불필요한 코드를 줄일 수 있다.
    default long returnAsLong() {
        int i = returnAsInt();
        return (long)i;
    }
}

class Integer implements Printable {
    int i;

    public int returnAsInt() {
        return this.i;
    }

 }

class Long implements Printable {
    long l;

    public int returnAsInt() {
        return (int)l;
    }

}


public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        Printable p1 = new Integer();
        Printable p2 = new Long();
        p1.returnAsLong();
        p2.returnAsLong();
    }
}
