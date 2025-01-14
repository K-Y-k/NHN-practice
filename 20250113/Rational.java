/* 유리수 끼리 연산을 위한 프로그램 */
public class Rational {
    private int parent;
    private int sub;

    public Rational(int x, int y) {
        sub = x;
        parent = y;
    }

    public int getParent() {
        return parent;
    }

    public int getSub() {
        return sub;
    }


    static int getLeastCommonMultiplier(int x, int y) {
        int result = 0;

        if (Math.max(x, y) % Math.min(x, y) == 0) {
            result = Math.max(x, y);
        } else {
            result = x * y;
        }

        return result;
    }

    Rational add(Rational r) {
        int commonParent = getLeastCommonMultiplier(parent, r.parent);

        int multi1 = commonParent / parent;
        int multi2 = commonParent / r.parent;


        parent = commonParent;
        sub = sub * multi1 + r.sub * multi2;
        
        return this;
    }

    Rational subtract(Rational r) {
        int commonParent = getLeastCommonMultiplier(parent, r.parent);

        int multi1 = commonParent / parent;
        int multi2 = commonParent / r.parent;


        parent = commonParent;
        sub = sub * multi1 - r.sub * multi2;


        return this;
    }

    Rational times(Rational r) {
        parent *= r.parent;
        sub *= r.sub;
        return this;
    }

    Rational divide(Rational r) {
        parent *= r.sub;
        sub *= r.parent;
        return this;
    }
}

class Test {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 10);
        Rational r2 = new Rational(2, 5);

        Rational result1 = r1.add(r2);
        System.out.println(result1.getSub() + "/" + result1.getParent());


        Rational r3 = new Rational(2, 3);
        Rational r4 = new Rational(1, 6);

        Rational result2 = r3.subtract(r4);
        System.out.println(result2.getSub() + "/" + result2.getParent());


        Rational r5 = new Rational(1, 10);
        Rational r6 = new Rational(2, 5);

        Rational result3 = r5.times(r6);
        System.out.println(result3.getSub() + "/" + result3.getParent());



        Rational r7 = new Rational(1, 10);
        Rational r8 = new Rational(2, 5);

        Rational result4 = r7.divide(r8);
        System.out.println(result4.getSub() + "/" + result4.getParent());
    }
}
