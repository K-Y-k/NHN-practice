public class Super {
    protected int i;

    public Super(int i) {
        this.i = i;
    }
}

class Sub extends Super {
    private int j;

    public Sub(int i, int j) {
        super(i);
        this.j = j;
    }

    @Override
    public String toString() {
        return "i:" + this.i + " j:" + this.j;
    }
}

class Test {
    public static void main(String[] args) {
        Sub s = new Sub(1, 5);

        System.out.println(s);
    }
}