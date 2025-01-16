import java.util.Arrays;

public class Student implements Comparable<Student> {
    private int no;
    private String name;

    public Student(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return this.name;
    }

    public int getNo() {
        return this.no;
    }

    @Override
    public int compareTo(Student otherStudent) {
        // if (this.getNo() > s.getNo()) {
        //     return 1;
        // } else if (this.getNo() < s.getNo()) {
        //     return -1;
        // } else {
        //     return 0;
        // }

        // 꼭 1, 0, -1을 반환할 필요는 없고 양수,0,음수로 판단 가능
        return this.getNo() - otherStudent.getNo();
    }

    @Override
    public String toString() {
        return this.no + ", " + this.name;
    }
}


class Test4 {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Celine", 1), 
            new Student("asd", 4),
            new Student("cczxc", 3),
            new Student("kyk", 2)};

        for (Student student : students) {
            System.out.println(student);
        }

        // 정상적으로 정렬이 안된다.
        // 필드 값을 기준으로 비교해야하기 때문
        // Exception in thread "main" java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable 
        
        // Comparable을 상속 받고 compareTo 메소드를 구현 해야 정상 작동
        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}