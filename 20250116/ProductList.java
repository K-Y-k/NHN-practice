import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ProductList {
    List<Product> list = new LinkedList<>();

    public void add(Product p) {
        this.list.add(p);
    }

    public void sort(Comparator<Product> comparator) {
        Collections.sort(list, comparator);
    }
}
