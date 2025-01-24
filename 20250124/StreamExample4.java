import java.nio.file.*;
import java.util.stream.Stream;
import java.io.IOException;


public class StreamExample4 {
    public static void main(String[] args) {
        Path filePath = Paths.get("yesterday.txt"); // 파일 경로 지정

        // Files.lines(Path path) 메소드는 파일의 내용을 한 줄씩 Stream<String>으로 반환한다.
        try (Stream<String> lines = Files.lines(filePath)) {
            lines.filter(line -> line.contains("yesterday")) // "yesterday"를 포함한 줄 필터링
                 .map(String::toUpperCase)      // 대문자로 변환
                 .forEach(System.out::println); // 결과 출력
        } catch (IOException e) {
        }
    }
}
