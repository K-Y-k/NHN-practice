import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Department<E extends Person> implements Iterable<E> {
    private int no;
    private String name;

    ArrayList<E> list;

    public Department(int no, String name) {
        this.no = no;
        this.name = name;

        this.list = new ArrayList<>();
    }

    public void add(E element) {
        this.list.add(element);
    }

    public int getNo() {
        return this.no;
    }

    public String getName() {
        return this.name;
    }

    public void sort() {
        Collections.sort(list);
    }

    public void sort(Comparator<E> comparator) {
        Collections.sort(list, comparator); // 정렬 조건을 직접 구현한 Comparator를 적용
    }

    public void sortByName() {
        // 함수형 인터페이스인 Comparator를 람다식으로 구현하여 적용
        Collections.sort(list, (s1, s2) -> s1.getName().compareTo(s2.getName()));
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return this.name;
    }
}