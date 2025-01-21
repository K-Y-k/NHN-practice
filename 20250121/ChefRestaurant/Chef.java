package ChefRestaurant;

public class Chef {
    public String knife = "칼";

    public String getStuff() {
        return this.knife;
    }

    public void accept(MenuVisitor visitor) {
        visitor.visit(this);    
    }

    public void accept(NoodleVisitor visitor) {
        visitor.visit(this);
    }

    public void accept(PorkVisitor visitor) {
        visitor.visit(this);
    }
}