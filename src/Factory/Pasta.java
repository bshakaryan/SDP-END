package Factory;

public class Pasta extends Dish {
    public Pasta() {
        this.name = "Pasta";
        this.price = 8.99;
    }
    public void prepare() {
        System.out.println("Preparing Pasta");
    }
}
