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

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize kitchen notification system
        KitchenNotifier kitchenNotifier = new KitchenNotifier();
        kitchenNotifier.addObserver(new Waiter("John"));

        // Create an order
        Order order = new Order();

        // --- Menu Options ---
        System.out.println("Welcome to the Restaurant!");
        boolean ordering = true;

        while (ordering) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Pasta - $10.00");
            System.out.println("2. Pizza - $12.00");
//            System.out.println("3. Salad - $8.00");
            System.out.println("3. Done ordering");

            System.out.print("Select an option (1-3): ");
            int choice = scanner.nextInt();

            Dish dish = null;
            switch (choice) {
                case 1 -> dish = DishFactory.createDish("Pasta");
                case 2 -> dish = DishFactory.createDish("Pizza");
//                case 3 -> dish = DishFactory.createDish("Salad");
                case 3 -> ordering = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }

            if (dish != null) {
                System.out.println("Selected: " + dish.name + ", Price: $" + dish.price);

                // Customization options using Decorator pattern
                boolean customizing = true;
                while (customizing) {
                    System.out.println("\n--- Customization Options ---");
                    System.out.println("1. Add Extra Cheese - $1.50");
                    System.out.println("2. Add Extra Sauce - $0.75");
                    System.out.println("3. Add Extra Toppings - $2.00");
                    System.out.println("4. No more customizations");

                    System.out.print("Select an option (1-4): ");
                    int customizationChoice = scanner.nextInt();

                    switch (customizationChoice) {
                        case 1 -> dish = new ExtraCheeseDecorator(dish);
                        case 2 -> dish = new ExtraSauceDecorator(dish);
                        case 3 -> dish = new ExtraToppingsDecorator(dish);
                        case 4 -> customizing = false;
                        default -> System.out.println("Invalid choice. Please try again.");
                    }

                    System.out.println("Current Dish: " + dish.name + ", Price: $" + dish.price);
                }

                // Add the customized dish to the order
                order.addDish(dish);
            }
        }

        // Applying Discount Strategy
        System.out.println("\n--- Discount Options ---");
        System.out.println("1. No Discount");
        System.out.println("2. Student Discount (10%)");
        //System.out.println("3. Senior Discount (15%)");

        System.out.print("Select a discount option (1-2): ");
        int discountChoice = scanner.nextInt();

        DiscountStrategy discountStrategy;
        switch (discountChoice) {
            case 2 -> discountStrategy = new StudentDiscount();
            //case 3 -> discountStrategy = new Senior Discount();
            default -> discountStrategy = new NoDiscount();
        }

        double totalWithDiscount = discountStrategy.applyDiscount(order.getTotalPrice());
        System.out.println("Total after discount: $" + totalWithDiscount);

        // Confirm and Place Order using Command Pattern
        Command placeOrder = new PlaceOrderCommand(order);
        placeOrder.execute();

        // Change and print order status using State Pattern
        OrderContext orderContext = new OrderContext();
        orderContext.printStatus();
        orderContext.next();
        orderContext.printStatus();
        orderContext.next();
        orderContext.printStatus();

        // Prepare the order using KitchenFacade
        KitchenFacade kitchen = new KitchenFacade();
        kitchen.prepareOrder(order);
        kitchen.notifyWaiters(kitchenNotifier);

        // Process Payment using Adapter Pattern
        System.out.println("\n--- Payment Options ---");
        System.out.println("1. Pay using Credit Card");
        System.out.println("2. Pay using External Payment Processor");

        System.out.print("Select a payment option (1-2): ");
        int paymentChoice = scanner.nextInt();

        PaymentGateway paymentGateway;
        if (paymentChoice == 2) {
            paymentGateway = new PaymentAdapter(); // Use adapter for external payment
        } else {
            paymentGateway = amount -> System.out.println("Payment of $" + amount + " made with Credit Card.");
        }
        paymentGateway.processPayment(totalWithDiscount);

        // Handling complaints using Chain of Responsibility Pattern
        System.out.println("\nWould you like to file a complaint? (yes/no)");
        String complaintResponse = scanner.next();

        if (complaintResponse.equalsIgnoreCase("yes")) {
            System.out.println("Enter the type of complaint (minor/major/critical): ");
            String complaintType = scanner.next();

            ComplaintHandler minorHandler = new MinorComplaintHandler();
            ComplaintHandler majorHandler = new MajorComplaintHandler();
            ComplaintHandler criticalHandler = new CriticalComplaintHandler();

            minorHandler.setNextHandler(majorHandler);
            majorHandler.setNextHandler(criticalHandler);

            minorHandler.handleComplaint(complaintType);
        } else {
            System.out.println("Thank you for dining with us!");
        }

        scanner.close();
        
    }
}
