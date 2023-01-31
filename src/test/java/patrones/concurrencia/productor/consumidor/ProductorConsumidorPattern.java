package patrones.concurrencia.productor.consumidor;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProductorConsumidorPattern {

    @Test
    public void methodTest() {

        // Arrange

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new ProducerConsumer.Producer());
        executorService.execute(new ProducerConsumer.Consumer());
        executorService.shutdown();

        // Act

        // Assert

    }

}
