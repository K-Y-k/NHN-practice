import java.util.Arrays;

public class GenericAlgorithm {
    public static void main(String[] args) {
        Integer[] integers = {1,10,5,4,6,7};
        String[] strings = {"d", "k", "A", "z", "C","g"};
        
        System.out.println("전: " + Arrays.toString(integers));
        bubbleSort(integers);
        System.out.println("후: " + Arrays.toString(integers));

        System.out.println();

        System.out.println("전: " + Arrays.toString(strings));
        bubbleSort(strings);
        System.out.println("후: " + Arrays.toString(strings));

    }

    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;
    
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}