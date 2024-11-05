package Decorator;

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

public class ExtraToppingsDecorator extends DishDecorator {
    public ExtraToppingsDecorator(Dish dish) {
        super(dish);
        this.price = dish.price + 2.00;
        this.name = dish.name + " + Extra Toppings";
    }

    @Override
    public void prepare() {
        decoratedDish.prepare();
        System.out.println("Adding extra toppings");
    }
}
