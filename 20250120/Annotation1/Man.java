package Annotation1;

public class Man extends Person {
    Man(String name) {
        super(name);
    }

    // 어노테이션으로 오타 부분을 컴파일러가 잡아준다.
    @Override
    public String getGender() {
        return "Man";
    }
}
