public class MethodChaining {
}

class Sample {
    int i = 0;

    public Sample add(int i) {
        i += 1;
        return this;
    }

    public AnotherSample doSomething() {
        return new AnotherSample();
    }    
}

class AnotherSample {
    public Sample doSomething() {
        return new Sample();
    }    
}


class Test2 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.add(1);
        System.out.println(s.i);

        AnotherSample as = s.doSomething();
        Sample s2 = s.doSomething().doSomething();
    }
}
