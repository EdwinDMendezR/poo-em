package variables.linkedhashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    @Test
    public void methodTest() {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("A");
        strings.add("B");
        Assertions.assertTrue(strings.contains("A"));
    }

}
