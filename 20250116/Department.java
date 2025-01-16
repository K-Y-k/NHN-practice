import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Department implements Iterable<Student> { // Student를 담을 수 있는 Iterable
    private int no;
    private String name;

    ArrayList<Student> studentList;

    public Department(int no, String name) {
        this.no = no;
        this.name = name;

        this.studentList = new ArrayList<>();
    }

    public void add(Student student) {
        this.studentList.add(student);
    }

    public int getNo() {
        return this.no;
    }

    public String getName() {
        return this.name;
    }

    public void sort() {
        Collections.sort(studentList);
    }

    @Override
    public Iterator<Student> iterator() {
        return studentList.iterator();
    }
}