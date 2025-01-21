package ChefRestaurant;

public class PorkVisitor implements MenuVisitor {
    @Override
    public void visit(Chef chef) {
        System.out.println(chef.getStuff() + "로 고기를 잘라 탕수육을 만듭니다.");
    }
}
