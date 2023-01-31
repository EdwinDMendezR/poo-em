package patrones.procesos.pipelining;

public class DataStore  implements Processor {
    @Override
    public void process(int data) {
        System.out.println("Data storing: " + data);
    }
}