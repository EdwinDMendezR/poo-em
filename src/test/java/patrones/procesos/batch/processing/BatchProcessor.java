package patrones.procesos.batch.processing;

import java.util.List;

public class BatchProcessor {

    private final List<Object> data;
    private final int batchSize;

    public BatchProcessor(List<Object> data, int batchSize) {
        this.data = data;
        this.batchSize = batchSize;
    }

    public void processBatches() {
        int i = 0;
        for (i = 0; i + batchSize <= data.size(); i += batchSize) {
            List<Object> batch = data.subList(i, i + batchSize);
            processBatch(batch);
        }

        if (i < data.size()) {
            List<Object> batch = data.subList(i, data.size());
            processBatch(batch);
        }
    }

    private void processBatch(List<Object> batch) {
        System.out.println("Realizar el procesamiento de un lote aquí");
    }

}
