public class NonSingleton {
    int i;

    // 생성자가 public으로 new로 새로운 인스턴스를 생성할 수 있어 
    // 싱글톤이 아니다.
    public NonSingleton() {

    }

    public int getNextNumber() {
        return i++;
    }

    public int getValue() {
        return this.i;
    }
}

class Test3 {
    public static void main(String[] args) {
        NonSingleton n = new NonSingleton();
        int no1 = n.getNextNumber();
        int no2 = n.getNextNumber();
        System.out.println(no1);
        System.out.println(no2);


        NonSingleton n2 = new NonSingleton();
        int no3 = n2.getNextNumber();
        int no4 = n2.getNextNumber();
        System.out.println(no3);
        System.out.println(no4);
    }
}