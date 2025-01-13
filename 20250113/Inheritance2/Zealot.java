package Inheritance2;

public class Zealot extends Unit implements Attackable {
    public Zealot(String s) {
        super(s);
        this.hp = 30;
    }

    public void attack(Unit unit) {
        System.out.println(this.name + "이 찌르기 공격을 합니다.");
    }
}
