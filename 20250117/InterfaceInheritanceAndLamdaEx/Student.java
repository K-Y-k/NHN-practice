package InterfaceInheritanceAndLamdaEx;
// Person이 Comparable을 상속 받으므로 
// Person을 상속받는 Student도 Comparable을 구현해야 한다!
public class Student implements Person {
    private int no;
    private String name;

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    // Person의 getNo구현
    public int getNo() {
        return this.no;
    }
    // Person의 getName구현
    public String getName() {
        return this.name;
    }
    
    // Person의 Comparable을 구현해야 한다!
    @Override
    public int compareTo(Person p) {
        // 꼭 1, 0, -1을 반환할 필요는 없고 양수,0,음수로 판단 가능
        return this.getNo() - p.getNo();
    }

    @Override
    public String toString() {
        return this.no + ", " + this.name;
    }
}