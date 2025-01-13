public class ZealotSamle {
    // 특정 규칙에만 적용할 수 있게
    // private로 직접 접근하지 못하게 함
    private int hp;
    private int shield = 0;
    private int attackPower = 3;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return this.hp;
    }

    public void attack(ZealotSamle z) {
        if (z.shield != 0) {
            z.shield -= attackPower;
        } else {
            z.hp -= attackPower;
        }
    }
}

class PlayGround {
    public static void main(String[] args) {
        // Zealot 클래스의 인스턴스1
        ZealotSamle z1 = new ZealotSamle();
        z1.setHp(20);

        
        // Zealot 클래스의 인스턴스2
        ZealotSamle z2 = new ZealotSamle();
        z2.setHp(20);

        z1.attack(z2);
    }
}