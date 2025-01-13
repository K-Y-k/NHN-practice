public class Zergling {
    private int hp;
    private String name;
    private Location point;
    private int attackPower = 2;

    public void setData(String name) {
        this.hp = 15;
        this.name = name;
        this.point = new Location();
        this.point.setLocation(0, 0);
    } 

    public void setHp(int attackPower) {
        hp -= attackPower;
    }

    public String getName() {
        return name;
    }

    
    public void attack(Marine unit) {
        System.out.println(this.name + "이 " + unit.getName() + "에게 물기를 시전합니다.");
        unit.setHp(attackPower);
    }

    public void attack(Zealot unit) {
        System.out.println(this.name + "이 " + unit.getName() + "에게 물기를 시전합니다.");
        unit.setHp(attackPower);
    }

    public void attack(Zergling unit) {
        System.out.println(this.name + "이 " + unit.getName() + "에게 물기를 시전합니다.");
        unit.setHp(attackPower);
    }

    public Location move(int x, int y) {
        this.point = new Location();
        this.point.setLocation(x, y);
        return this.point;
    }


    public String toString() {
        return this.name + ", " + this.hp + ", " + this.point.getLocation();
    }
}
