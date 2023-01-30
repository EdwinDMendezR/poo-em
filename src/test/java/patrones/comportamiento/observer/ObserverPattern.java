package patrones.comportamiento.observer;

import org.junit.jupiter.api.Test;

public class ObserverPattern {

    @Test
    public void methodTest() {

        // Arrange
        Subject subject = new Subject();
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setValue(10);
        subject.setValue(20);

        // Act

        // Assert

    }

}
