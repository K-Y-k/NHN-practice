public class Branching {
    public static void main(String[] args) {
        int[] tables = {2,3,4,5,6,7,8,9};
        
        int sum = 0;
        for (int i : tables) {
            if (i == 3) {
                continue; // ���� �ǳʶٰ� ���� �ݺ� ����
            }

            sum += i;
            System.out.println(i);

            if (i == 5) {
                break;    // �ݺ� ����
            }
        }
        
        System.out.println("5 found!");
        System.out.printf("�� = %d", sum);
    }
}
