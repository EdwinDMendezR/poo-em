package patrones.concurrencia.barrera;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CyclicBarrier;

public class BarrierPattern {

    @Test
    public void methodTest() {

        // Arrange
        int numThreads = 5;
        CyclicBarrier barrier = new CyclicBarrier(numThreads);

        for (int i = 0; i < numThreads; i++) {
            Thread t = new Thread(new Worker(barrier));
            t.start();
        }

        // Act

        // Assert

    }

}
