public class Type2 {
    public static void main(String[] args) {
        long l = Long.MAX_VALUE;
        System.out.println(l);     // 9223372036854775807
        System.out.println(l + 1); // -9223372036854775808

        //int i = l;    // ǥ�� ������ �� ���� int�� ����� �� ��ȯ �ʿ�
        
        int i2 = Integer.MAX_VALUE;
        long l2 = i2;   // ǥ�� ������ �� ���� long���� ������ �� ��ȯ
    }
}
