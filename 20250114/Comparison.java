public class Comparison {
    public static void main(String[] args) {
        int[] array1 = {1, 2}; // I@7a81197d
        int[] array2 = {1, 2}; // I@5ca881b5

        System.out.println(array1);
        System.out.println(array2);

        // 참조 타입의 ==은 참조 값을 비교하므로
        System.out.println(array1 == array2); // false

        System.out.println();

        int[] array3 = {1, 2}; // I@24d46ca6
        int[] array4 = array3; // I@24d46ca6

        System.out.println(array3);
        System.out.println(array4);

        // 참조 타입은 정상 비교가 안됨
        // 참조 값을 비교하므로
        System.out.println(array3 == array4); // false
    }
}