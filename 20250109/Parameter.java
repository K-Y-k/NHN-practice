public class Parameter {
    public static int max2(int i, int j) {
        return (i > j) ? i : j;
    }

    public static int max3(int i, int j, int k) {
        return max2(max2(i,j), k);
    }

    // 여러 값을 모두 담을 수 있는 가변 길이 파라미터 
    public static int max(int... values) {
        int result = 0;

        for (int i : values) {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.println(array);
        
        int max = max(1,2,3,4);
    }
}
