public class GenericBox<T> {
    private T item;

    public GenericBox(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}

class Test {
    public static void main(String[] args) {
        GenericBox<Integer> box1 = new GenericBox<>(1);
        System.out.println(box1.getItem());

        GenericBox<String> box2 = new GenericBox<>("ddd");
        System.out.println(box2.getItem());
    }
}
