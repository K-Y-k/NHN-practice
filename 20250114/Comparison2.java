public class Comparison2 {
    public static void main(String[] args) {
        // String 클래스 비교
        String s1 = new String("abc");
        String s2 = new String("abc");
        
        System.out.println(s1 == s2); // false


        String s3 = "abc";
        String s4 = "abc";
        
        System.out.println(s3== s4); // true
    }
}
