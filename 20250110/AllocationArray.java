public class AllocationArray {
    static int i;      // 기본형은 자동으로 기본 값을 할당해준다.
    static int[] iArr; // 참조형은 직접 할당해주지 않으면 null이다.
    static int[] iArr2 = new int[3]; // 참조형은 new 키워드로 명시적으로 생성해주어야 한다. 

    public static void main(String[] args) {
        System.out.println(i);        // 0
        System.out.println(iArr);     // null
        System.out.println(iArr2);    // I@7a81197d

        System.out.println();
        

        int[] array = new int[5];

        // 값 할당
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i : array) {
            System.out.println(i);
        }

        System.out.println();

        
        int[][] array2 = {
            {1,2,3},
            {4,5,6}
        };

        // 2차원 배열 출력 방식
        for (int[] array1 : array2) {
            for (int i : array1) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
}