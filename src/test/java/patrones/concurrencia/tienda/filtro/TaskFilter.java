package patrones.concurrencia.tienda.filtro;

public class TaskFilter  implements Runnable {

    private TaskStore store;

    public TaskFilter(TaskStore store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Task task = store.getTask();
                task.execute();
            } catch (InterruptedException e) {
                break;
            }
        }
    }

}