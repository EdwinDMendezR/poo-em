package patrones.concurrencia.sincronizar.hilo;

import java.util.concurrent.locks.ReentrantLock;

public class Shared {

    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

}
