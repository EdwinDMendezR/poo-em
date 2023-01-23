package variables.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
    public void methodTest() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Assertions.assertEquals("A", list.get(0));
    }

}
