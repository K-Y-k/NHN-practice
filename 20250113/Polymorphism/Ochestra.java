package Polymorphism;

public class Ochestra {
    public static void main(String[] args) {
        /* 부모 객체로 자식 객체를 참조하지만
         * 동작은 오버라이딩 된 자식 객체의 메소드로 실행된다.
         */
        Player v1 = new ViolinPlayer();
        Player v2 = new ViolinPlayer();

        Player t1 = new TrumpetPlayer();
        Player t2 = new TrumpetPlayer();

        Player[] ochestra = {v1, v2, t1, t2};
        
        for (Player p : ochestra) {
            p.play();
        }

        
        // 실제로 이ꁰ한 player를 생성할 일이 없다.
        // 그래서 생성되면 안되고 추상화만 시키기 위한 클래스를 추상클래스라고 한다.
        // Player p = new Player();
        // p.play();
    }
}
