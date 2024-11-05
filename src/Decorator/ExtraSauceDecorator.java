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
public class ExtraSauceDecorator extends DishDecorator {
    public ExtraSauceDecorator(Dish dish) {
        super(dish);
        this.price = dish.price + 0.75;
        this.name = dish.name + " + Extra Sauce";
    }

    @Override
    public void prepare() {
        decoratedDish.prepare();
        System.out.println("Adding extra sauce");
    }
}
