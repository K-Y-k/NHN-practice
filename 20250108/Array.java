public class Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        
        // ���� �� ���
        System.out.println(array[5]);

        // �迭 ����
        System.out.println(array.length);

        // while������ �迭 ���� ���
        int index = 0;
        while (index < array.length) {
            System.out.println("array[" + index + "] = " + array[index]);
            index++;
        }

        System.out.println();

        // for������ �迭 ���� ���
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        
        System.out.println();
        
        // foreach��
        for (int i : array) {
            System.out.println(i);
        }
    }
}
