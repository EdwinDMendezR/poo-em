package variables.hashtable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Hashtable;

public class HashTableTest {

    @Test
    public void methodTest() {
        Hashtable<String, Integer> table = new Hashtable<>();
        table.put("A", 1);
        table.put("B", 2);
        table.put("C", 3);
        Assertions.assertEquals(3, table.get("C"));
    }

}
