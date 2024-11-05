package Composite;

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

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Dish> dishes = new ArrayList<>();
    public void addDish(Dish dish) {
        dishes.add(dish);
    }
    public double getTotalPrice() {
        return dishes.stream().mapToDouble(d -> d.price).sum();
    }
    public List<Dish> getDishes() {
        return dishes;
    }
}

