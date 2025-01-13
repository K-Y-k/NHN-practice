package Inheritance;

public interface Attackable {
    // 참조하여 오버라이딩 된 자식 메소드들이 사용하므로
    // 메소드 이름 선언이 필요하다.
    void attack(Unit unit);
}
