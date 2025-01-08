import java.util.*;

public class Bubblesort {
    public static void main(String[] args) {
        int[] array = {1,7,3,4,8,1,12};

        // 내가 부족했던점 
        // 한번 이동하면 연산 횟수를 줄여가야하는데 같은 횟수로 반복되었다.
        // 그 이유는 종료 값에 첫 for문의 루프 값을 안 빼주었기 때문

        // 내가 푼 방식
        // 하나의 for문에 현재 위치와 옆의 위치의 2개 변수를 선언하여
        // 같이 증감 해주며 버블 정렬
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0, k = 1; k < array.length - i; j++, k++) {
        //         if (array[j] > array[k]) {
        //             int temp = array[k];
        //             array[k] = array[j];
        //             array[j] = temp;
        //         }
        //     }
        // }


        // 정석 풀이
        // 그냥 하나의 변수와 그 변수 값 +1로 옆의 칸으로 설정하여 구하면 됨
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    // 자바는 pass by value로 일반 기본형 값은 참조하여 공유되는 것이 아니므로
                    // 참조할 수 있는 것도 같이 파라미터로 넣어서 적용한다.
                    swap(array, j, j+1);
                }
            }
        }


        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
