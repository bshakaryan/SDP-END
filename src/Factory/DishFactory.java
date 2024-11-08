package Factory;

public class DishFactory {
    public static Dish createDish(String type) {
        switch (type) {
            case "Pasta": return new Pasta();
            case "Pizza": return new Pizza();
            default: throw new IllegalArgumentException("Unknown dish type");
        }
    }
}
