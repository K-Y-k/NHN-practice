public class Professor implements Comparable<Professor> {
    private int employeeNo;
    private String name;
    private String major;

    public Professor(int employeeNo, String name, String major) {
        this.employeeNo = employeeNo;
        this.name = name;
        this.major = major;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }
    public String getName() {
        return name;
    }
    public String getMajor() {
        return major;
    }

    @Override
    public int compareTo(Professor otherProfessor) {
        return this.employeeNo - otherProfessor.getEmployeeNo();
    }

}
