package InterfaceInheritanceAndLamdaEx;
import java.util.Comparator;

// Stuendt의 이름을 기준으로 구현한 Comparator 구현체
public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}