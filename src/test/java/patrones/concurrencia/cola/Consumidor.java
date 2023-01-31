package patrones.concurrencia.cola;

public class Consumidor  implements Runnable {
    private MensajeQueue queue;

    public Consumidor(MensajeQueue q) {
        this.queue = q;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String mensaje = queue.take();
                System.out.println("Consumido: " + mensaje);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

