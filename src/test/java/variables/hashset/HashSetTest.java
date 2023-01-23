package variables.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

public class HashSetTest {

    @Test
    public void methodTest() {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        Assertions.assertTrue(set.contains("A"));
    }

}
