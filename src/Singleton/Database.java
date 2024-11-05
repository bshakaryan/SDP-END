package Singleton;

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
public class Database {
    private static Database instance;
    private Database() {}
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    public void saveOrder(Order order) {
        System.out.println("Order saved to database: " + order);
    }
}
