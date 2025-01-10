public class DimensionArray {
    /* 1차원 배열과 2차원 배열은 서로 다른 타입이다.
     * 즉, 오버로딩이 가능
     */
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void printArray(int[][] array2) {
        for (int[] array : array2) {
            for (int i : array) {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(int[][][] array3) {
        for (int[][] array2 : array3) {
            for (int[] array : array2) {
                for (int i : array) {
                    System.out.println(i + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    // 생성하는 메서드
    public static int[] createArray(int i) {
        int[] result = new int[i];
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[][] matrix = {
            {1,2,3},
            {4,5,6}
        };
        int[][][] cube = {
            {
                {1,2,3},
                {4,5,6}
            },
            {
                {7,8,9},
                {10,11,12}
            }
        };

        System.out.println(array.getClass().getName());
        System.out.println(matrix.getClass().getName());
        System.out.println(cube.getClass().getName());
        System.out.println();

        
        System.out.println("1차원 배열 출력");
        printArray(array);

        System.out.println("2차원 배열 출력");
        printArray(matrix);

        System.out.println("3차원 배열 출력");
        printArray(cube);
    }
}
