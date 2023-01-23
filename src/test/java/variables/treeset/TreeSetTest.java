package variables.treeset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void methodTest() {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        Assertions.assertEquals("A", set.ceiling("A"));
    }

}
