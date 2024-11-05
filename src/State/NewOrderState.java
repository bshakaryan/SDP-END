package State;

public class NewOrderState implements OrderState {
    public void next(OrderContext context) {
        context.setState(new InProgressState());
    }
    public void prev(OrderContext context) {
        System.out.println("This is the first state.");
    }
    public void printStatus() {
        System.out.println("Order is new.");
    }
}