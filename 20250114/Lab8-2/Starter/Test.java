public class Test {
    public static void main(String[] args) {
        int i = 0;
        Integer number = 1;
        String s = "Hello";

        System.out.println(Utilities.isCharSequence(i));
        System.out.println(Utilities.isCharSequence(number));
        System.out.println(Utilities.isCharSequence(s));


        Message m = new Message("Greetings");
        Test t = new Test();

        Utilities.display(m); // Message는 IPrinable 인터페이스의 자식이므로 적용됨
        Utilities.display(t); // Test는 IPrinable과 아무 연관이 없으므로 무시
    }
}
