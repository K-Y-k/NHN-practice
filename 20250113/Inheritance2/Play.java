package Inheritance2;

public class Play {
    public static void main(String[] args) {
        Unit m1 = new Marine("Marine1");
        System.out.println(m1.toString());
        System.out.println();

        Unit[] units = {new Marine("Marine2"), new Zealot("Zealot1"), new Medic("Medic1")};

        // 모든 유닛을 조회하지만
        for (Unit unit : units) {
            // 공격 가능한 유닛 구별하기
            if (unit instanceof Attackable) {
                ((Attackable) unit).attack(unit);
            }
        }
    }
}
