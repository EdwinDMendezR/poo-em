package variables.priorityqueue;

import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

public class PriorityQueueTest {

    @Test
    public void methodTest() {
        PriorityQueue<String> strings = new PriorityQueue<>();
        strings.add("A");
        strings.add("B");


        // Print the contents of the PriorityQueue
        System.out.println("PriorityQueue: " + strings);

        // Remove the element with the highest priority
        String result = strings.poll();
        System.out.println("Removed element: " + result);

        // Print the contents of the PriorityQueue after removing an element
        System.out.println("PriorityQueue after removing an element: " + strings);

    }

}
