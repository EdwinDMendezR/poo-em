package patrones.concurrencia.bloqueo.conjunto;

import org.junit.jupiter.api.Test;

public class BloqueoConjuntoPattern {

    @Test
    public void methodTest() {

        // Arrange
        BlockingSet set = new BlockingSet();

        Runnable addTask = () -> {
            for (int i = 0; i < 100; i++) {
                set.add(String.valueOf(i));
            }
        };

        Runnable containsTask = () -> {
            for (int i = 0; i < 100; i++) {
                set.contains(String.valueOf(i));
            }
        };

        Thread addThread1 = new Thread(addTask);
        Thread addThread2 = new Thread(addTask);
        Thread containsThread1 = new Thread(containsTask);
        Thread containsThread2 = new Thread(containsTask);

        addThread1.start();
        addThread2.start();
        containsThread1.start();
        containsThread2.start();

        // Act

        // Assert

    }

}
