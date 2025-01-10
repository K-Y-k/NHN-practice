public class ArrayCopy {
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    // 공유하지 않고 새로운 배열로 생성해서 복사하는 함수
    public static int[] clone(int[] source) {
        int[] result = new int[source.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = source[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] array2 = array;        // array 배열과 공유
        int[] array3 = clone(array); // array 배열을 복사해서 새로운 배열로 생성한 것

        array[1] = 50;               // array 요소 값이 수정됨
        
        printArray(array2);          // 위 array 요소가 수정된 배열로 반환
        printArray(array3);          // 수정되지 않은 array 배열로 반환
    }
}