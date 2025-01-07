public class SystemMethod {
    public static void main(String[] args) {
        // System.out 메소드
        double d = 5.0;
        System.out.printf("%f", d); // 출력에 포맷을 지정
        System.out.println();

        String name = "Celine";
        System.out.print("안녕, ");      // 표준 화면 출력
        System.out.println(name);          // 표준 화면 출력 + 줄 바꿈

        String message = "메시지 전송합니다.";
        System.out.printf("%s, %s", message, name);
    }
}
