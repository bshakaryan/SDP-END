package Observer;

public class Waiter implements Observer {
    private String name;
    public Waiter(String name) { this.name = name; }
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
