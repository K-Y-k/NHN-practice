import java.util.Set;
import java.util.TreeSet;

public class HashTest {
    // 해시 코드 크기를 줄이기 위해
    static final int SIZE = 100;

    // 값을 해시 코드로 변환 후 크기를 가공 해시 함수
    public static int hashFunction(Object o) {
        return Math.abs(o.hashCode()) % SIZE;
    }


    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        // 해시코드는 Virtual Machine에서 동작하는 모든 객체를 구별하기 위해 고유한 값으로 저장한 것
        System.out.println("String".hashCode()); // -1808118735
        System.out.println("Strin".hashCode());  // 80220918
        System.out.println();


        String s ="Celine";
        User user = new User(1, "Celine", 31);

        int i = hashFunction(s);
        int j = hashFunction(user);

        System.out.println(i);
        System.out.println(j);
    }
}
