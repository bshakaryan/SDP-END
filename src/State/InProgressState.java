package State;

public class InProgressState implements OrderState {
    public void next(OrderContext context) {
        context.setState(new ReadyState());
    }
    public void prev(OrderContext context) {
        context.setState(new NewOrderState());
    }
    public void printStatus() {
        System.out.println("Order is being prepared.");
    }
}
