package patrones.concurrencia.pool.hilos;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolHilosPattern {

    @Test
    public void methodTest() {

        // Arrange
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");

        // Act

        // Assert

    }

}
