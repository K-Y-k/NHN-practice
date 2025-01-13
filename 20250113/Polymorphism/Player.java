package Polymorphism;

// 실제로 Player를 생성할 일이 없다.
// 그래서 생성되면 안되고 추상화만 시키기 위한 클래스를 추상클래스라고 한다.
public abstract class Player {
    // 참조하여 오버라이딩 된 자식 메소드들이 사용하므로
    // 메소드 이름 선언이 필요하다.
    public abstract void play();
}
