package patrones.concurrencia.monitor;

import org.junit.jupiter.api.Test;

public class MonitorPattern {

    @Test
    public void methodTest() {

        // Arrange

        Monitor monitor = new Monitor();

        // hilo 1
        new Thread(() -> {
            monitor.doWork();
        }).start();

        // hilo 2
        new Thread(() -> {
            monitor.doWork();
        }).start();

        // hilo 3
        new Thread(() -> {
            monitor.someMethodThatChangesTheCondition();
        }).start();

        // Act

        // Assert

    }

}
