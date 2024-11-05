package Command;

import Adapter.*;
import Builder.*;
import ChainOfResponsibility.*;
import Command.*;
import Composite.*;
import Decorator.*;
import Facade.*;
import Factory.*;
import Observer.*;
import Singleton.*;
import State.*;
import Strategy.*;
public class PlaceOrderCommand implements Command {
    private Order order;
    public PlaceOrderCommand(Order order) {
        this.order = order;
    }
    public void execute() {
        System.out.println("Order placed with total: " + order.getTotalPrice());
        Database.getInstance().saveOrder(order);
    }
}
