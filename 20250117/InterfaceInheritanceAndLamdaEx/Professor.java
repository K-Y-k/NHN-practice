// Person이 Comparable을 상속 받으므로 
// Person을 상속받는 Professor도 Comparable을 구현해야 한다!
public class Professor implements Person {
    private int employeeNo;
    private String name;
    private String major;

    public Professor(int employeeNo, String name, String major) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.major = major;
    }

    // Person의 getNo구현
    public int getNo() {
        return employeeNo;
    }
    // Person의 getName구현
    public String getName() {
        return name;
    }
    public String getMajor() {
        return major;
    }

    @Override
    public int compareTo(Person p) {
        return this.employeeNo - p.getNo();
    }

    @Override
    public String toString() {
        return this.employeeNo + ", " + this.name;
    }
}
