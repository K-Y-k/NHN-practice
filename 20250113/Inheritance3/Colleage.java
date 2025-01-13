package Inheritance3;

public class Colleage {
    public static void main(String[] args) {
        Student s1 = new Undergraduate();
        s1.setName("Celine");
        System.out.println(s1.getStudentName()); 

        Student s2 = new Graduate();
        s2.setName("KYK");

        s1.study();
        s2.study();
    }
}
