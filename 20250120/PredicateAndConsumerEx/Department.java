package PredicateAndConsumerEx;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Department {
    List<Integer> integerList = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();

    // Predicate 인터페이스
    // 조건을 테스트하고 true 또는 false를 반환하는 Functional Interface 
    // 숫자 필터링
    // 람다식 조건을 Predicate 타입으로 받아온다.
    public List<Integer> filter(Predicate<Integer> predicate) {
        List<Integer> resultIntegerList = new ArrayList<>();
        
        for (Integer n : integerList) {
            if (predicate.test(n)) {       // 조건에 해당하면 
                resultIntegerList.add(n);  // 넣는다.
            }
        }

        return resultIntegerList;
    }


    // 학생 객체 기준 필터링
    public List<Student> filter2(Predicate<Student> predicate) {
        List<Student> resultStudentList = new ArrayList<>();

        for (Student s : studentList) {
            if (predicate.test(s)) {       // 조건에 해당하면  
                resultStudentList.add(s);  // 넣는다.
            }
        }

        return resultStudentList;
    }

    // Consumer 인터페이스
    // 값을 소비(사용)하며, 아무 값도 return 하지 않는 Functional Interface
    public void accept(Consumer<Student> consumer) {
        // 출력 활용
        for (int i = 0; i < studentList.size(); i++) {
            consumer.accept(studentList.get(i));
        }
    }
}
