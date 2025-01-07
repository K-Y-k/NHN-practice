public class Type2 {
    public static void main(String[] args) {
        long l = Long.MAX_VALUE;
        System.out.println(l);     // 9223372036854775807
        System.out.println(l + 1); // -9223372036854775808

        //int i = l;    // 표현 범위가 더 적은 int로 명시적 형 변환 필요
        
        int i2 = Integer.MAX_VALUE;
        long l2 = i2;   // 표현 범위가 더 넓은 long으로 묵시적 형 변환
    }
}
