package ChefRestaurant;

public class NoodleVisitor implements MenuVisitor {
    @Override
    public void visit(Chef chef) {
        System.out.println(chef.getStuff() + "로 야채를 잘라 자장면을 만듭니다.");
    }
}


