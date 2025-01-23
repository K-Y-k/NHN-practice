import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        /* HashSet은 해시를 기반으로 구현되어 있다.
           아스키코드의 해시 함수를 적용한 해시코드는 아스크코드 값 그대로이다.
           즉, 해시코드의 인덱스 번호가 순서대로 들어가지는 원리이므로
           아스키코드의 값들은 정렬되어 추가된다! */
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(4);

        for (int i : set) {
            System.out.println(i);
        }


        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("5");
        set2.add("3");
        set2.add("4");
        set2.add("2");

        for (String s : set2) {
            System.out.println(s);
        }
    }
}
