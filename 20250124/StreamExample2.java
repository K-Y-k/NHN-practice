import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        /* 직렬 스트림과 병렬 스트림 */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // 직렬 스트림
        // 정렬되어 나온다.
        numbers.stream()
            .map(number -> number * 2)
            .forEach(System.out::println);

        // 병렬 스트림
        // 정렬되지 않지만 성능적으로 제일 빠르다.
        numbers.parallelStream()
            .map(number -> number * 2)
            .forEach(System.out::println);
        

        System.out.println();

        
        /* 중간 연산 활용 */
        /* 스트림에서 정렬 + 중복 없애기 + 개수 제한 및 건너뛰기 */
        List<String> names = Arrays.asList("David", "David", "Alice", "Charlie", "Bob");

        // 오름차순 정렬 + 중복 없애기 distinct() + 개수 제한
        List<String> sortedNames = names.stream()
                                        .distinct()
                                        .sorted()
                                        .limit(3)
                                        .collect(Collectors.toList()); // 컬렉션 기반 Stream의 결과를 다시 컬렉션으로 변환
        
        System.out.println(sortedNames);
        System.out.println();
        
        // 사용자 정의 정렬 (내림차순) + 건너뛰기
        List<String> reverseSortedNames = names.stream()
                                                .skip(2)
                                                .sorted(Comparator.reverseOrder())
                                                .collect(Collectors.toList());
        
        System.out.println(reverseSortedNames);
    }
}
