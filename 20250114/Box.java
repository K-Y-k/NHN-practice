public class Box {
    public static void main(String[] args) {
        int i = 5;

        Integer wrapper = new Integer(i); // 박싱
        Integer wrapper2 = i;             // 오토 박싱

        int i2 = wrapper.intValue();     // 언박싱
        int i3 = wrapper2;               // 오토 언박싱

        System.out.println(wrapper);
        System.out.println(i2);
    }
}
