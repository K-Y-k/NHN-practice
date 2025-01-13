package Inheritance;

public class Playground2 {
    public static void main(String[] args) {
        Unit[] units = {new Marine(), new Zealot(), new Medic(), new Zergling(), new Hydra(), new Firebat(), new Dragoon()};
        units[0].setData("Marine1");
        units[1].setData("Zealot1");
        units[2].setData("Medic1");
        units[3].setData("Zergling1");
        units[4].setData("Hydra1");
        units[5].setData("Firebat1");
        units[6].setData("Dragoon1");


        for (int i = 0; i < units.length-1; i++) {
            if (units[i] instanceof Attackable) {
                ((Attackable)units[i]).attack(units[i+1]);
            } else {
                System.out.println(units[i].getName() + "이라서 공격을 못합니다.");
            }
        }
    }
}
