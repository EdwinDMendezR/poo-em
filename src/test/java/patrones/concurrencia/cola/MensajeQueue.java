package patrones.concurrencia.cola;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MensajeQueue {

    private BlockingQueue<String> queue = new LinkedBlockingQueue<>();

    public void add(String mensaje) {
        queue.add(mensaje);
    }

    public String take() throws InterruptedException {
        return queue.take();
    }

}
