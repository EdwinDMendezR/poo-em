package patrones.procesos.pipelining;

public class DataTransform  implements Processor {
    @Override
    public void process(int data) {
        System.out.println("Data transforming: " + data);
    }
}
