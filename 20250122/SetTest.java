import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("Celine");
        set1.add("Robert");
        set1.add("Robert");
        set1.add("Dick");

        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println();


        // 트리 구조라서 
        // TreeSet은 데이터를 추가할 때 정렬되어 저장된다.
        Set<String> set2 = new TreeSet<>();
        set2.add("Celine");
        set2.add("Robert");
        set2.add("Robert");
        set2.add("Dick");

        for (String s : set2) {
            System.out.println(s);
        }
    }
}
