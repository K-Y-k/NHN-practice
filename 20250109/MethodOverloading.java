public class MethodOverloading {
    static int max(int i, int j) {
        return (i > j) ? i :j;
    }

    // 메소드 오버로딩
    // 파라미터의 개수와 타입가 다르면 같은 이름을 가진 메소드 사용가능
    static int max(int i, int j, int k) {
        return max(max(i, j), k);
    }

    static void print(int i) {
        System.out.println(i);
    }
    static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        max(1, 2, 3);
    }
}
