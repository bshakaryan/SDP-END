package Builder;

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

public class CustomDishBuilder {
    private Dish dish;
    public CustomDishBuilder(String type) {
        dish = DishFactory.createDish(type);
    }
    public CustomDishBuilder addExtraCheese() {
        dish.price += 1.5;
        return this;
    }
    public CustomDishBuilder addSauce() {
        dish.price += 0.5;
        return this;
    }
    public Dish build() {
        return dish;
    }
}
