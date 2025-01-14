/* 유리수 끼리 연산을 위한 프로그램 */
public class Rational {
    private int numerator;   // 분자
    private int denominator; // 분모

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("denomiator can't be zero");
        }

        int gcd = gCD(numerator, denominator);

        this.denominator = denominator / gcd;
        this.numerator = numerator/gcd;
    }

    private static int gCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gCD(b, a % b);
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }


    Rational add(Rational r) {
        int numerator = (this.numerator * r.denominator) + (this.denominator * r.numerator);
        int denomiator = this.denominator * r.denominator;

        return new Rational(numerator, denomiator);
    }

    Rational denominatortract(Rational r) {
        int numerator = (this.numerator * r.denominator) - (this.denominator * r.numerator);
        int denomiator = this.denominator * r.denominator;

        return new Rational(numerator, denomiator);
    }

    Rational times(Rational r) {
        numerator *= r.numerator;
        denominator *= r.denominator;

        int gcd = gCD(numerator, denominator);
        this.denominator /= gcd;
        this.numerator /= numerator/gcd;

        return this;
    }

    Rational divide(Rational r) {
        numerator *= r.denominator;
        denominator *= r.numerator;

        int gcd = gCD(numerator, denominator);
        this.denominator /= gcd;
        this.numerator /= gcd;

        return this;
    }
}

class Test5 {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 10);
        Rational r2 = new Rational(2, 5);

        System.out.println(r1.toString());
        Rational result1 = r1.add(r2);
        System.out.println(result1.toString());


        Rational r3 = new Rational(2, 3);
        Rational r4 = new Rational(1, 6);

        Rational result2 = r3.denominatortract(r4);
        System.out.println(result2.toString());


        Rational r5 = new Rational(1, 10);
        Rational r6 = new Rational(2, 5);

        Rational result3 = r5.times(r6);
        System.out.println(result3.toString());


        Rational r7 = new Rational(1, 10);
        Rational r8 = new Rational(2, 5);

        Rational result4 = r7.divide(r8);
        System.out.println(result4.toString());
    }
}
