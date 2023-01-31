package patrones.concurrencia.tienda.filtro;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TaskStore {

    private BlockingQueue<Task> tasks = new ArrayBlockingQueue<>(100);

    public void addTask(Task task) {
        tasks.add(task);
    }

    public Task getTask() throws InterruptedException {
        return tasks.take();
    }

}
