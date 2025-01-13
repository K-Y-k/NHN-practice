public class Playground {
    public static void main(String[] args) {
        Marine m1 = new Marine();
        m1.setData("Marine1");

        Marine m2 = new Marine();
        m2.setData("Marine2");

        m1.attack(m2);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println();


        Zealot z1 = new Zealot();
        z1.setData("Zealot1");

        Zealot z2 = new Zealot();
        z2.setData("Zealot2");
        
        z1.attack(m1);
        System.out.println(z1);
        System.out.println(z2);
        System.out.println();

        Zergling zerg1 = new Zergling();
        zerg1.setData("Zergling1");

        zerg1.attack(m2);
        System.out.println(zerg1);
        System.out.println();
    }
}
