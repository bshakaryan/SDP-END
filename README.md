# Restaurant Management System

## Description
The **Restaurant Management System** is a terminal-based application that simulates a restaurant's operation, allowing users to interact with the menu, customize dishes, apply discounts, and make payments. It incorporates multiple design patterns, including **Creational**, **Structural**, **Behavioral**, and **Adapter**, to manage the complexity and ensure flexibility. The system also features dynamic behavior, such as order status changes and complaint handling.

### Key Features:
- **Dish Selection**: Users can choose from various dishes.
- **Customization**: Users can add extra ingredients (like cheese, sauce, and toppings) using the **Decorator** pattern.
- **Discount Application**: Discounts are applied using different strategies (e.g., student, senior).
- **Order Management**: The order can be placed, and its status changes based on the system's state.
- **Payment Integration**: Payment is processed using an adapter pattern to support multiple payment gateways.
- **Complaint Handling**: Users can file complaints, which are handled through a chain of responsibility.

## Documentation

### Key Design Patterns
1. **Creational Patterns**:
   - **Factory Pattern**: Used to create dishes dynamically.
   - **Singleton Pattern**: Ensures only one instance of the kitchen notification system.
   - **Builder Pattern**: Allows building complex orders with different customization options.

2. **Structural Patterns**:
   - **Adapter Pattern**: Converts different payment methods to a common interface.
   - **Decorator Pattern**: Adds extra ingredients to a dish without modifying the original dish class.

3. **Behavioral Patterns**:
   - **Strategy Pattern**: Applies different discount strategies (e.g., student, senior).
   - **State Pattern**: Manages the changing state of an order (e.g., placed, prepared, completed).
   - **Chain of Responsibility Pattern**: Handles complaints of varying severity.

4. **Command Pattern**: Used to place and execute orders, encapsulating order requests.
   
### Usage Instructions
1. Clone or download the repository.
2. Compile and run the `RestaurantApp.java` file.
3. Follow the terminal prompts to:
   - Select a dish.
   - Customize the dish (add toppings, cheese, etc.).
   - Choose a discount and process payment.
   - File a complaint if needed.

### Example Interaction
```
Welcome to the Restaurant!

--- Menu ---
1. Pasta - $10.00
2. Pizza - $12.00
3. Salad - $8.00
4. Done ordering
Select an option (1-4): 2
Selected: Pizza, Price: $12.00

--- Customization Options ---
1. Add Extra Cheese - $1.50
2. Add Extra Sauce - $0.75
3. Add Extra Toppings - $2.00
4. No more customizations
Select an option (1-4): 1
Current Dish: Pizza + Extra Cheese, Price: $13.50

Select a discount option (1-3): 2
Total after discount: $12.15
...
```

## Project Structure

The project is organized into the following structure:

```
Restaurant Management System

src
|
|-- Adapter
|   |-- ExternalPaymentProcessor.java
|   |-- PaymentAdapter.java
|   |-- PaymentGateway.java
|
|-- Builder
|   |-- CustomDishBuilder.java
|
|-- ChainOfResponsibility
|   |-- ComplaintHandler.java
|   |-- CriticalComplaintHandler.java
|   |-- MajorComplaintHandler.java
|   |-- MinorComplaintHandler.java
|
|-- Command
|   |-- Command.java
|   |-- PlaceOrderCommand.java
|
|-- Composite
|   |-- Order.java
|
|-- Decorator
|   |-- DishDecorator.java
|   |-- ExtraCheeseDecorator.java
|   |-- ExtraSauceDecorator.java
|   |-- ExtraToppingsDecorator.java
|
|-- Facade
|   |-- KitchenFacade.java
|
|-- Factory
|   |-- Dish.java
|   |--DishFactory.java
|   |--Pasta.java
|   |--Pizza.java
|
|-- Observer
|   |-- KitchenNotifier.java
|   |-- Observer.java
|   |-- Waiter.java
|
|-- Singleton
|   |--Database.java
|
|-- State
|   |-- InProgressState.java
|   |-- NewOrderState.java
|   |-- OrderContext.java
|   |-- OrderState.java
|   |-- ReadyState.java
|
|-- Strategy
|   |-- DiscountStrategy.java
|   |-- NoDiscount.java
|   |-- StudentDiscount.java
|
|-- Main.java
```

## Project Diagram

Below is a simplified diagram of the project structure and the relationships between major components:

```
                 +--------------------------+
                 |       Dish (Base)        |
                 +--------------------------+
                            |
                            |
                +--------------------------+
                |      DishDecorator       |
                +--------------------------+
                |    Concrete Decorators   |
                +--------------------------+
                            |
                            v
                  +----------------------+
                  |    ExtraCheese       |
                  |    ExtraSauce        |
                  |    ExtraToppings     |
                  +----------------------+
                            |
                            v
                      +------------+
                      |    Order   |
                      +------------+
                            |
                            v
                 +-----------------------+
                 | Payment (Strategy)    |
                 +-----------------------+
                            |
                            v
                    +-------------------+
                    | Payment Adapter   |
                    +-------------------+
                            |
                            v
                 +--------------------------+
                 | ExternalPaymentProcessor |
                 +--------------------------+
                            |
                            v
                 +-------------------------+
                 |      Order Command      |
                 +-------------------------+
                            |
                            v
                      +------------+
                      | PlaceOrder |
                      +------------+

```
---

