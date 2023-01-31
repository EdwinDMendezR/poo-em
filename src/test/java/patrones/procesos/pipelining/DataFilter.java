package patrones.procesos.pipelining;

public class DataFilter implements Processor {
    @Override
    public void process(int data) {
        System.out.println("Data filtering: " + data);
    }
}
