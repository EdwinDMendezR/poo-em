package patrones.concurrencia.barrera;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Worker  implements Runnable {
    private CyclicBarrier barrier;

    public Worker(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println("El trabajador está haciendo su tarea");
            Thread.sleep(1000);
            System.out.println("El trabajador terminó su tarea");
            barrier.await();
            System.out.println("Todos los trabajadores han terminado su tarea");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
