package patrones.concurrencia.tienda.filtro;

import org.junit.jupiter.api.Test;

public class TiendaFiltroPattern {

    @Test
    public void methodTest() {

        // Arrange

        TaskStore store = new TaskStore();
        for (int i = 0; i < 10; i++) {
            new Thread(new TaskFilter(store)).start();
        }

        // Add some tasks to the store
        store.addTask(() -> System.out.println("Task 1"));
        store.addTask(() -> System.out.println("Task 2"));
        store.addTask(() -> System.out.println("Task 3"));

        // Act

        // Assert

    }

}
