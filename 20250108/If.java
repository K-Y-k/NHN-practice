public class If {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        int k = 0;
        
        // if ��
        if (i > j) {
            k = 1;
        } else {
            k = 2;
        }
        
        // ���׿�����
        k = (i > j) ? 1 : 2;
        System.out.println(k);
    }
}
