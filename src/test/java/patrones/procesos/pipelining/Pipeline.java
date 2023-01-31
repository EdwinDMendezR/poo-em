package patrones.procesos.pipelining;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {
    private final List<Processor> processors = new ArrayList<>();

    public void add(Processor processor) {
        processors.add(processor);
    }

    public void run(int data) {
        for (Processor processor : processors) {
            processor.process(data);
        }
    }
}
