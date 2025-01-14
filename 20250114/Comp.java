public class Comp {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        
        // 참조값 비교
        System.out.println(s1 == s2);      // false
        // 실제 객체를 비교
        System.out.println(s1.equals(s2)); // true

        
        // 리터럴 형식으로 선언할 경우
        // 해당 리터럴이 이미 선언되어 있으면 해당 값의 위치로 참조하게 된다.
        String s3 = "abc"; // 01010
        String s4 = "abc"; // 01010
        
        System.out.println(s3== s4);       // true

        System.out.println(s4);

    }
}
