import java.util.Comparator;

public class ProductNoComparator implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        return p1.getProductNo() - p2.getProductNo();
    }
}
