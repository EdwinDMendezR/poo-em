package patrones.concurrencia.cola;

import org.junit.jupiter.api.Test;

public class QueuePattern {

    @Test
    public void methodTest() {

        // Arrange
        MensajeQueue queue = new MensajeQueue();
        new Thread(new Productor(queue)).start();
        new Thread(new Consumidor(queue)).start();

        // Act

        // Assert

    }

}
