import java.util.*;

public class Bubblesort {
    public static void main(String[] args) {
        int[] array = {1,7,3,4,8,1,12};

        // ���� �����ߴ��� 
        // �ѹ� �̵��ϸ� ���� Ƚ���� �ٿ������ϴµ� ���� Ƚ���� �ݺ��Ǿ���.
        // �� ������ ���� ���� ù for���� ���� ���� �� ���־��� ����

        // ���� Ǭ ���
        // �ϳ��� for���� ���� ��ġ�� ���� ��ġ�� 2�� ������ �����Ͽ�
        // ���� ���� ���ָ� ���� ����
        // for (int i = 0; i < array.length; i++) {
        //     for (int j = 0, k = 1; k < array.length - i; j++, k++) {
        //         if (array[j] > array[k]) {
        //             int temp = array[k];
        //             array[k] = array[j];
        //             array[j] = temp;
        //         }
        //     }
        // }


        // ���� Ǯ��
        // �׳� �ϳ��� ������ �� ���� �� +1�� ���� ĭ���� �����Ͽ� ���ϸ� ��
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    // �ڹٴ� pass by value�� �Ϲ� �⺻�� ���� �����Ͽ� �����Ǵ� ���� �ƴϹǷ�
                    // ������ �� �ִ� �͵� ���� �Ķ���ͷ� �־ �����Ѵ�.
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
