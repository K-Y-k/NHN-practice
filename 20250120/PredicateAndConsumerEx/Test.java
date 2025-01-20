package PredicateAndConsumerEx;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    // 람다식 대신 메소드로 적용한 방식
    // public static boolean contains(Student s) {
    //     return s.contains(s.name);
    // }

    public static void main(String[] args) {
        Department dep = new Department();
        dep.integerList.add(1);
        dep.integerList.add(2);
        dep.integerList.add(3);

        // 짝수 기준으로 적용
        // Predicate<Integer> isEven = n -> n % 2 == 0;
        // dep.filter(isEven);
        List<Integer> result1 = dep.filter((i) -> (i % 2) == 0);

        for (Integer i : result1) {
            System.out.println(i);
        }
        System.out.println();


        Department dep2 = new Department();
        dep2.studentList.add(new Student(1, "Celine", "CE"));
        dep2.studentList.add(new Student(3, "James", "CM"));
        dep2.studentList.add(new Student(2, "Kyk", "CS"));

        // 학번 짝수 기준으로 필터링
        Predicate<Student> isEven2 = s -> (s.no % 2) == 0;
        List<Student> result2 = dep2.filter2(isEven2);

         // 람다식 대신 메소드로 적용한 방식
        // List<Student> result22 = dep2.filter2(Test3::contains);

        for (Student s : result2) {
            System.out.println(s);
        }
        System.out.println();

        // 이름 기준으로 필터링
        Predicate<Student> isEven3 = s -> (s.name.contains("Celine"));
        List<Student> result3 = dep2.filter2(isEven3);

        for (Student s : result3) {
            System.out.println(s);
        }
        System.out.println();

        
        // 모두 출력
        dep2.accept((s) -> System.out.print(s));
        System.out.println();
        System.out.println();

        dep2.accept((s) -> System.out.println(s));
        System.out.println();

        dep2.accept(System.out::println);
    }
}
