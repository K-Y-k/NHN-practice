package VisitorPattern;
public interface Planet {
    void accept(SpaceShip ship);
}

class Mars implements Planet {
    /*
     * 동적 디스패치 (Dynamic Dispatch)
     * 런타임에 호출할 메소드가 결정된다.
     * ex) 메소드 오버라이딩 (Method Overriding)
     */
    public void accept(SpaceShip ship) {
        ship.visit(this);
    }
}
class Mercury implements Planet {
    public void accept(SpaceShip ship) {
        ship.visit(this);
    }
}
class Jupyter implements Planet {
    public void accept(SpaceShip ship) {
        ship.visit(this);
    }
}