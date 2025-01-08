public class Branching {
    public static void main(String[] args) {
        int[] tables = {2,3,4,5,6,7,8,9};
        
        int sum = 0;
        for (int i : tables) {
            if (i == 3) {
                continue; // 현재 건너뛰고 다음 반복 진행
            }

            sum += i;
            System.out.println(i);

            if (i == 5) {
                break;    // 반복 종료
            }
        }
        
        System.out.println("5 found!");
        System.out.printf("합 = %d", sum);
    }
}
