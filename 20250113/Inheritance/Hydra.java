package Inheritance;

public class Hydra extends Unit implements Attackable{
    @Override 
    public void attack(Unit unit) {
        /* 부모 클래스의 필드를 protected로 접근할 수 있게 만들었기에
           this.으로 접근할 수 있게됨 */
        System.out.println(this.name + "이 " + unit.getName() + "에게 독 뱉기 공격을 합니다.");
        unit.setHp(this.attackPower);
    }
}
