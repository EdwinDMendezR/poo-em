package patrones.procesos.batch.processing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BatchProcesssorPatern {

    @Test
    public void methodTest() {

        // Arrange
        List<Object> data = new ArrayList<>();
        // Agregar datos a la lista aquí

        int batchSize = 100;
        BatchProcessor batchProcessor = new BatchProcessor(data, batchSize);
        batchProcessor.processBatches();

        // Act

        // Assert

    }

}
