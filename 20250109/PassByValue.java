public class PassByValue {
    /* 자바는 항상 pass By value만 동작한다! */

    public static void addOne(int i) {
        i += 1; // 6이 되었지만 반환하지 못하여 사라진다.
    }

    public static void main(String[] args) {
        int i = 5;
        
        addOne(i);

        System.out.println(i); // 5
    }
}
