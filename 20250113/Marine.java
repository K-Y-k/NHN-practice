public class Marine {
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
        System.out.println(this.name + "이 " + unit.getName() + "에게 기관총을 난사합니다.");
        unit.setHp(attackPower);
    }

    public void attack(Zealot unit) {
        System.out.println(this.name + "이 " + unit.getName() + "에게 기관총을 난사합니다.");
        unit.setHp(attackPower);
    }

    public void attack(Zergling unit) {
        System.out.println(this.name + "이 " + unit.getName() + "에게 기관총을 난사합니다.");
        unit.setHp(attackPower);
    }

    public Location move(int x, int y) {
        this.point = new Location();
        this.point.setLocation(x, y);
        return this.point;
    }


    /* 자바의 최고 부모는 Object 객체인데 
     * 이 객체의 toString()은 기본적으로 메모리 참조값을 나타내는데
     * 오버라이드로 내가 원하는 형태로 동작하게함
     */
    @Override
    public String toString() {
        return this.name + ", " + this.hp + ", " + this.point.getLocation();
    }
}
