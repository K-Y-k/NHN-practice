package VisitorPattern;
public class SpaceShip {

    public void visit(Planet planet) {
        // if (planet instanceof Mercury) {
        //     System.out.println("Check temp");
        // } else if (planet instanceof Mars) {
        //     System.out.println("Check existance of water");
        // } else if (planet instanceof Jupyter) {
        //     System.out.println("Gatter gas");
        // } else {
        //     System.out.println("What do I do??");
        // }
        System.out.println("What do I do??");
    }
    
    /**
     * 정적 디스패치 (Static Dispatch)
     * 컴파일 시점에 호출할 메소드가 결정된다.
     * ex) 메소드 오버로딩 (Method Overloading)
     */
    public void visit(Mercury planet) {
        System.out.println("Check temp");
    }

    public void visit(Mars planet) {
        System.out.println("Check existance of water");
    }

    public void visit(Jupyter planet) {
        System.out.println("Gatter gas");
    }
}
