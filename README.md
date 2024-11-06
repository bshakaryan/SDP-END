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
Welcome to the Restaurant!

--- Menu ---

Pasta - $10.00
Pizza - $12.00
Salad - $8.00
Done ordering Select an option (1-4): 1 Selected: Pasta, Price: $10.00
--- Customization Options ---

Add Extra Cheese - $1.50
Add Extra Sauce - $0.75
Add Extra Toppings - $2.00
No more customizations Select an option (1-4): 1 Current Dish: Pasta + Extra Cheese, Price: $11.50
--- Discount Options ---

No Discount
Student Discount (10%)
Senior Discount (15%) Select a discount option (1-3): 2 Total after discount: $10.35
vbnet
Copy code

## Project Structure

The project is organized into the following structure:

restaurant-management-system/ │ ├── src/ │ ├── Dish.java # Base class for Dish │ ├── DishFactory.java # Factory class for creating dishes │ ├── DishDecorator.java # Base Decorator class for Dish │ ├── ExtraCheeseDecorator.java # Concrete decorator for cheese │ ├── ExtraSauceDecorator.java # Concrete decorator for sauce │ ├── ExtraToppingsDecorator.java # Concrete decorator for toppings │ ├── Order.java # Order class for managing dishes │ ├── PaymentGateway.java # Payment interface │ ├── PaymentAdapter.java # Adapter for external payment gateway │ ├── Command.java # Command interface for order actions │ ├── PlaceOrderCommand.java # Command to place an order │ ├── OrderContext.java # Context for handling order states │ ├── DiscountStrategy.java # Strategy interface for discounts │ ├── StudentDiscount.java # Concrete strategy for student discount │ ├── SeniorDiscount.java # Concrete strategy for senior discount │ ├── NoDiscount.java # Concrete strategy for no discount │ ├── ComplaintHandler.java # Handler interface for complaints │ ├── MinorComplaintHandler.java # Concrete handler for minor complaints │ ├── MajorComplaintHandler.java # Concrete handler for major complaints │ ├── CriticalComplaintHandler.java # Concrete handler for critical complaints │ └── KitchenNotifier.java # Observer for notifying kitchen │ ├── README.md # Project description and documentation ├── LICENSE # License information └── pom.xml # Maven project configuration

csharp
Copy code

## Project Diagram

Below is a simplified diagram of the project structure and the relationships between major components:

sql
Copy code
             +--------------------------+
             |       Dish (Base)        |
             +--------------------------+
                        |
                        |
            +--------------------------+
            |      DishDecorator        |
            +--------------------------+
            |       Concrete Decorators |
            +--------------------------+
                        |
                        v
              +----------------------+
              |    ExtraCheese        |
              |    ExtraSauce         |
              |    ExtraToppings      |
              +----------------------+
                        |
      +------------------------------------------+
      |            Order Command               |
      +------------------------------------------+
                        |
                        v
                 +------------+
                 |    Order   |
                 +------------+
                        |
                        v
            +----------------------+
            | Payment (Strategy)    |
            +----------------------+
                        |
                        v
               +-------------------+
               | Payment Adapter   |
               +-------------------+
yaml
Copy code

---

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
