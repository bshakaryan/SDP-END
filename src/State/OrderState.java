package State;

public interface OrderState {
    void next(OrderContext context);
    void prev(OrderContext context);
    void printStatus();
}
