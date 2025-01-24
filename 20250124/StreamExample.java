import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        /* 1.Stream은 선언적 프로그래밍이다! */
        /* 2.Stream은 데이터 흐름 중심에 Lazy Evaluation 방식이라서 성능 최적화가 된다! */
        names.stream()
            .filter(name -> { // 중간 처리
                System.out.println("Filtering: " + name);
                return name.startsWith("A");
            })
            .map(name -> { // 중간 처리
                System.out.println("Mapping: " + name);
                return name.toUpperCase();
            })
            .forEach(System.out::println);  
            // 최종 처리 : 스트림은 무조건 최종 처리를 통해 스트림을 닫아줘야 한다!
            

        System.out.println();


        /* 3.Stream은 불변성을 유지한다! */
        System.out.println(names);
        System.out.println();


        /* 4.Stream은 병렬 처리 방식이 가능하다! */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        numbers.parallelStream()
                .forEach(System.out::println); // 병렬로 출력


        System.out.println();


        /* 5.Stream은 람다식, 메소드 참조 활용하는 함수형 프로그래밍 방식이 가능하다! */
        numbers.stream()
            .filter(n -> n % 2 == 0)         // Predicate: 짝수 필터링
            .map(n -> n * n)                 // Function: 제곱값으로 변환
            .forEach(System.out::println);   // Consumer: 출력
        

        /* 6.Stream은 컬렉션, 배열, 파일, I/O 등 다양한 데이터 소스에서 생성할 수 있다. */
        // 배열
        Stream.of("X", "Y", "Z").forEach(System.out::println);
        try {
            // 파일
            Files.lines(Paths.get("YESTERDAY.txt")).forEach(System.out::println);
        }
        catch (Exception e) {}
        }
}
