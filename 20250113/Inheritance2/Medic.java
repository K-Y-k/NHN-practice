package Inheritance2;

public class Medic extends Unit {
    public Medic(String s) {
        super(s);
        this.hp = 10;
    }

    /* 메딕에게만 부여되는 힐 동작 */
    public void heal(Marine m) {
        m.hp += 1;
    }
}
