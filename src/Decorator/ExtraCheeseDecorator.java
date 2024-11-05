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

public class ExtraCheeseDecorator extends DishDecorator {
    public ExtraCheeseDecorator(Dish dish) {
        super(dish);
        this.price = dish.price + 1.50;
        this.name = dish.name + " + Extra Cheese";
    }

    @Override
    public void prepare() {
        decoratedDish.prepare();
        System.out.println("Adding extra cheese");
    }
}
