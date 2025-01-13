package Inheritance;

public class Dragoon extends Unit implements Attackable{
    @Override
    public void attack(Unit unit) {
        System.out.println(this.getName() + "이 " + unit.getName() +"에게 광선 공격을 합니다.");
    }
}
