public class StirngArgs {
    // 인코딩 설정 등 컴파일을 실행할 때
    // 필요한 세팅 값을 String[] args 인자로 전달하는 것이다
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
