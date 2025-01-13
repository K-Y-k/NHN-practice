package Inheritance3;

public abstract class Student {
    private int studentNo;
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNo;
    }

    public String getStudentName() {
        return name;
    }


    /* 추상 메소드 */
    public abstract void study();
}
