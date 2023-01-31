package patrones.concurrencia.cola;

public class Productor  implements Runnable {
    private MensajeQueue queue;

    public Productor(MensajeQueue q) {
        this.queue = q;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            queue.add("Mensaje " + i);
            System.out.println("Producido: Mensaje " + i);
        }
    }
}