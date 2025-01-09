public class PrintAlgorithm {
    
    // 1차원 배열 프린팅 메서드
    public static void printing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length-1) {
                System.out.print(" ");
            }
        }

        System.out.print("\n");
    }

    // 2차원 배열 프린팅 메서드
    public static void printing(int[][] arr) {
        for (int[] arr1 : arr) {
            printing(arr1);
        }
    }

    // 3차원 배열 프린팅 메서드
    public static void printing(int[][][] arr) {
        for (int[][] arr2 : arr) {
            printing(arr2);
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[][] arr2 = {{1,2,3},
                        {4,5,6}};
        int[][][] arr3 = {{{1,2,3},
                           {4,5,6},
                           {7,8,9}},
                          {{10,11,12},
                           {13,14,15},
                           {16,17,18}}};
        
        printing(arr1);

        System.out.println();

        printing(arr2);

        System.out.println();

        printing(arr3);
    }


}
