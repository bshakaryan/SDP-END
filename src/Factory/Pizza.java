package Factory;

public class Pizza extends Dish {
    public Pizza() {
        this.name = "Pizza";
        this.price = 10.99;
    }
    public void prepare() {
        System.out.println("Preparing Pizza");
    }
}
