Description
This project is a Restaurant Management System that demonstrates the use of multiple Design Patterns for modular, scalable, and maintainable software architecture. The system simulates an ordering process in a restaurant, allowing customers to choose dishes, apply customizations, and process orders.

The system uses several design patterns, including Creational, Structural, and Behavioral patterns, which make the software flexible and extendable.

Project Features
Dish Customization: Apply toppings, cheese, and sauces using the Decorator Pattern.
Order Management: Create and process orders with multiple dishes.
Discount Strategy: Apply discounts using the Strategy Pattern.
Order Status: Handle the order flow using the State Pattern.
Order Placement: Place orders using the Command Pattern.
Payment Processing: Process payments through different methods using the Adapter Pattern.
Complaint Handling: Use the Chain of Responsibility Pattern to handle complaints.
Documentation
Key Design Patterns Implemented
Creational Patterns:

Singleton: Ensures a single instance of the KitchenNotifier.
Factory: Used to create dishes.
Builder: Constructs complex orders step by step.
Structural Patterns:

Decorator: Allows customization of dishes without altering the base classes.
Adapter: Adapts different payment gateways.
Composite: Allows grouping of multiple dishes into an order.
Facade: Simplifies the interaction with complex subsystems (e.g., kitchen preparation).
Behavioral Patterns:

Strategy: Applies different discount strategies (Student, Senior).
Command: Allows placing an order via the Command pattern.
State: Manages the status transitions of an order.
Observer: Notifies the waiter about changes in the kitchen status.
Chain of Responsibility: Handles complaints based on severity.
How to Use the Application
Run the Application:

bash
Copy code
java RestaurantApp
Interactive Steps:

Select a dish from the menu (Pizza, Pasta, Salad).
Customize your dish with extra cheese, sauce, or toppings.
Choose a discount strategy (e.g., Student or Senior Discount).
Place the order and pay using your chosen method.
Handle any complaints using the complaint system.
Project Structure
The project follows a structured folder organization, separating concerns according to the Design Patterns. Below is the directory structure in a diagram:

plaintext
Copy code
Restaurant-Management-System/
│
├── src/
│   ├── command/
│   │   └── PlaceOrderCommand.java
│   ├── decorator/
│   │   └── ExtraCheeseDecorator.java
│   ├── factory/
│   │   └── DishFactory.java
│   ├── strategy/
│   │   └── DiscountStrategy.java
│   ├── state/
│   │   └── OrderContext.java
│   ├── adapter/
│   │   └── PaymentAdapter.java
│   ├── observer/
│   │   └── KitchenNotifier.java
│   ├── composite/
│   │   └── Order.java
│   └── main/
│       └── RestaurantApp.java
│
├── diagrams/
│   └── project_structure.png
│
└── README.md

Diagram: Project Structure
![image](https://github.com/user-attachments/assets/27e46de8-d85c-4cd4-b7b3-a3e17f6f41e4)

