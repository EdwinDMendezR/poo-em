package patrones.comportamiento.observer;

public class ConcreteObserver implements Observer {
    private int value;

    @Override
    public void update(int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}
