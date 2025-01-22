import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        // List는 Iterable의 서브 타입
        Iterable<String> coll1 = new ArrayList<>();

        // List는 Collection의 서브 타입
        Collection<String> coll2 = new ArrayList<>();

        // HashSet은 Collection의 서브 타입
        Collection<String> coll3 = new HashSet<>();

        // ArrayList는 List의 서브 타입
        // List<String> coll4 = new ArrayList<>();

        coll2.add("Celine");
        coll2.add("James");
        coll2.add("Jason");
        coll2.add("Robert");
        coll2.add("Bob");


        // ArrayList -> List -> Collection -> Iterable이므로
        // Iterable의 iterator() 메소드로 Iterator를 가져옴
        Iterator<String> iterator = coll2.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        // Iterable의 forEach() 메소드 활용 
        coll2.forEach(System.out::println); // System.out의 println() 메소드 참조
    }
}