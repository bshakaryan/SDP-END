package State;

public class OrderContext {
    private OrderState state = new NewOrderState();
    public void setState(OrderState state) {
        this.state = state;
    }
    public void next() {
        state.next(this);
    }
    public void prev() {
        state.prev(this);
    }
    public void printStatus() {
        state.printStatus();
    }
}
