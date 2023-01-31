package patrones.concurrencia.sincronizar.hilo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class SincronizarHiloPattern {

    @Test
    @RepeatedTest(100)
    public void methodTest() throws InterruptedException {

        // Arrange
        Shared counter = new Shared();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());

        Assertions.assertEquals(2000, counter.getCount());
        // Act

        // Assert

    }

}
