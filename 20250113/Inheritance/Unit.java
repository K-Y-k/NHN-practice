package Inheritance;

// 실제로 Unit을 생성할 일이 없다.
// 그래서 생성되면 안되고 추상화만 시키기 위한 클래스를 추상클래스라고 한다.
public abstract class Unit {
    /* 자식 클래스에서도 해당 필드를 사용하려면 protected로 접근할 수 있어야 한다. */
    protected int hp;
    protected String name;
    protected Location point;
    protected int attackPower = 2;

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
