public class Type {
    public static void main(String[] args) {
        // �ڹ��� ���Ģ
        // �ڹٴ� ���� �����Ѵ�.

        // value Type ������ ���
        int i = 5;
        int j = i;             // ���� 5 ����
        i = 10;
        System.out.println(j); // 5


        // reference Type ������ ���
        int[] array = {1,2,3,4,5};
        int[] array2 = array; // array �������� �����Ͽ� ���� ����

        array2[1]= 10;
        System.out.println(array[1]); // 10
    }


    
}
