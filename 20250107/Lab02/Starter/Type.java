public class Type {
    public static void main(String[] args) {
        // 자바의 대원칙
        // 자바는 값을 복사한다.

        // value Type 복사한 경우
        int i = 5;
        int j = i;             // 값인 5 복사
        i = 10;
        System.out.println(j); // 5


        // reference Type 복사한 경우
        int[] array = {1,2,3,4,5};
        int[] array2 = array; // array 참조값을 복사하여 서로 공유

        array2[1]= 10;
        System.out.println(array[1]); // 10
    }


    
}
