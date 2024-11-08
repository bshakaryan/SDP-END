package State;

public class ReadyState implements OrderState {
    public void next(OrderContext context) {
        System.out.println("Order is already ready.");
    }
    public void prev(OrderContext context) {
        context.setState(new InProgressState());
    }
    public void printStatus() {
        System.out.println("Order is ready.");
    }
}
