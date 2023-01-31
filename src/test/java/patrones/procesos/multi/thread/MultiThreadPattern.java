package patrones.procesos.multi.thread;

import org.junit.jupiter.api.Test;

public class MultiThreadPattern {

    @Test
    public void methodTest() {

        // Arrange

        Runnable task = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hilo " + Thread.currentThread().getName() + " imprimiendo " + i);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();


        // Act

        // Assert

    }

}
