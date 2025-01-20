package VisitorPattern;
public class NasaTest {
    public static void main(String[] args) {
        Planet mars = new Mars();
        Planet mercury = new Mercury();

        SpaceShip ship = new SpaceShip();

        // ship.visit(mars);
        ship.visit(mercury);

        // 디스패치 : 메모리 할당으로 갈아 끼는 것 
        // ex) 오버로딩, 오버라이딩
        //     오버라이딩 2번 = 더블 디스패치
        mercury.accept(ship);
        mars.accept(ship);
    }
}
