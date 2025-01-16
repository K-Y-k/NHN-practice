public class ProductTest {
    public static void main(String[] args) {
        ProductList list = new ProductList();
        list.add(new Product(2, "TV", 10000));
        list.add(new Product(15, "Computer", 20000));
        list.add(new Product(3, "xxx", 30000));

        for (Product product : list.list) {
            System.out.println(product);
        }
        System.out.println();

        // no 기준으로 정렬
        list.sort(new ProductNoComparator()); // no 기준으로 직접 구현한 Comparator를 생성해서 넘김

        for (Product product : list.list) {
            System.out.println(product);
        }
        System.out.println();


        // 이름 기준으로 정렬
        list.sort(new ProductNameComparator()); // 이름 기준으로 직접 구현한 Comparator를 생성해서 넘김

        for (Product product : list.list) {
            System.out.println(product);
        }
        System.out.println();


        // 람다 익스프레션으로 설정한 정렬
        // 일일히 클래스로 직접 만들었던 Comparator의 불편함 해결
        list.sort((p1, p2) -> p1.getPrice() - p2.getPrice());
        for (Product product : list.list) {
            System.out.println(product);
        }
    }
}
