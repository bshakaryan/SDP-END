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

public abstract class DishDecorator extends Dish {
    protected Dish decoratedDish;

    public DishDecorator(Dish dish) {
        this.decoratedDish = dish;
    }

    @Override
    public void prepare() {
        decoratedDish.prepare(); // Delegate to the wrapped Dish
    }
}
