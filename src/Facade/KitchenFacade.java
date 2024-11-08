package Facade;

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
public class KitchenFacade {
    public void prepareOrder(Order order) {
        System.out.println("Starting kitchen preparation for order...");
        for (Dish dish : order.getDishes()) {
            dish.prepare();
        }
        System.out.println("Order preparation completed.");
    }

    public void notifyWaiters(KitchenNotifier kitchenNotifier) {
        kitchenNotifier.notifyObservers("Order is ready for delivery.");
    }
}
