package patrones.concurrencia.monitor;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Monitor {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void doWork() {
        lock.lock();
        try {
            while (someConditionIsNotMet()) {
                condition.await();
            }
            // acceder y modificar recurso compartido aquí
        } catch (InterruptedException e) {
            // manejar excepción aquí
        } finally {
            lock.unlock();
        }
    }

    private boolean someConditionIsNotMet() {
        return false;
    }

    public void someMethodThatChangesTheCondition() {
        lock.lock();
        try {
            // cambiar condición aquí
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

}
