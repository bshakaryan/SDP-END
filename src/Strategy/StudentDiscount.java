package Strategy;

public class StudentDiscount implements DiscountStrategy {
    public double applyDiscount(double price) {
        return price * 0.9;
    }
}
