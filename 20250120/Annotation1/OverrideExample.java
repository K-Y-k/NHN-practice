package Annotation1;

public class OverrideExample {
    @SuppressWarnings("deprecation") // 경고 무시 어노테이션
    public static void main(String [] args) {
        Person jason = new Man("jason");
        Person celine = new Woman("celine");

        jason.hello(celine);
        celine.hey(jason);   // @Deprecated로 인해 컴파일 경고


        System.out.println(jason.getGender());
        System.out.println(celine.getGender());
    }
}