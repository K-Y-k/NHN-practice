package Inheritance3;

/* 학부생 */
public class Undergraduate extends Student {
    @Override
    public void study() {
        System.out.println("그룹 스터디");
    }
}
