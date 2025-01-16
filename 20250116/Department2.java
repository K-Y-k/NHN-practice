import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Department2<E extends Comparable<E>> implements Iterable<E> { // 다른 객체도 담기 위한 제네릭 방식
    private int no;
    private String name;

    ArrayList<E> list;

    public Department2(int no, String name) {
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
        Collections.sort(list, comparator); // 정렬 조건이 직접 구현한 Comparator이다.
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }
}