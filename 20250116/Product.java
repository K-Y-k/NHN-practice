public class Product {
    private int productNo;
    private String name;
    private int price;

    public Product(int no, String name, int price) {
        this.productNo = no;
        this.name = name;
        this.price = price;
    }

    public int getProductNo() {
        return productNo;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return productNo + ", " + name + ", " + price;
    }
}
