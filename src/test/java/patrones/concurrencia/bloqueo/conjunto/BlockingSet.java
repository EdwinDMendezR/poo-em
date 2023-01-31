package patrones.concurrencia.bloqueo.conjunto;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class BlockingSet {

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Set<String> set = new HashSet<>();

    public void add(String element) {
        lock.writeLock().lock();
        try {
            set.add(element);
        } finally {
            lock.writeLock().unlock();
        }
    }

    public boolean contains(String element) {
        lock.readLock().lock();
        try {
            return set.contains(element);
        } finally {
            lock.readLock().unlock();
        }
    }

}
