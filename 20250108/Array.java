public class Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        
        // 원소 값 출력
        System.out.println(array[5]);

        // 배열 길이
        System.out.println(array.length);

        // while문으로 배열 값들 출력
        int index = 0;
        while (index < array.length) {
            System.out.println("array[" + index + "] = " + array[index]);
            index++;
        }

        System.out.println();

        // for문으로 배열 값들 출력
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        
        System.out.println();
        
        // foreach문
        for (int i : array) {
            System.out.println(i);
        }
    }
}
