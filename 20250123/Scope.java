public class Scope {
    public static void main(String[] args) {
        // 변수가 해당 블록 내부에서만 필요할 경우의 방식
        for (int i = 0; i < 10; i++) {
            int x = 0;
        }

        
        // 변수가 외부에서도 필요한 경우의 방식
        int x;
        for (int i = 0; i < 10; i++) {
            x = 0;
        }
    }
}