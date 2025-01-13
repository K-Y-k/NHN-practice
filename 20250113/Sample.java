public class Sample { 
    // main 함수가 static이 아니었다면
    // 해당 클래스를 호출하고 사용해야 한다.
    public void main(String[] args) {
        int i = 0;
        String s = i + "";          // int -> String 쉽게 변환 방법
        
        Person p1 = new Person();
        p1.socno = "111111-111111";
        p1.name = "Celine";

        Person p2 = new Person();
        
        Sample sp = new Sample();
        String[] ar = {"a", "b"};
        sp.main(ar);
    }
}

class Person {
    String socno;
    String name;

    public String getName() {
        return this.name;
    }
}