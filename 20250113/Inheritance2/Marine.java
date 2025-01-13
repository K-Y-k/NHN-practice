package Inheritance2;

/* 공격 가능한 유닛은 Attackable도 상속 */
public class Marine extends Unit implements Attackable{
    public Marine(String s) {
        // 항상 자식 객체를 생성하기 전에 부모 객체를 생성해야 한다.
        // 현재 Unit 부모 생성자가 선언된 것이 있으므로 super()로 호출해줘야한다.
        super(s);
        this.hp = 15;
    }

    public void attack(Unit unit) {
        System.out.println(this.name + "이 기관총 공격을 합니다.");
    }
}
