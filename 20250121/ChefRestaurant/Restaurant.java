package ChefRestaurant;

public class Restaurant {
    public void serve(Chef chef, MenuVisitor visitor) {
        chef.accept(visitor);
    }
}