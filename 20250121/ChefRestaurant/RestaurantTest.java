package ChefRestaurant;

public class RestaurantTest {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Chef chef = new Chef();

        restaurant.serve(chef, new NoodleVisitor());
        restaurant.serve(chef, new PorkVisitor());
    }
}
