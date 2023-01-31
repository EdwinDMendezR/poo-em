package patrones.procesos.asynchronous;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousPattern {

    @Test
    public void methodTest() {

        // Arrange
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hola " + threadName);
        });
        executor.shutdown();

        // Act

        // Assert

    }

}
