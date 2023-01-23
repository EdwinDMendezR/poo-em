package variables.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class HashMapTest {

    @Test
    public void methodTest() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        Assertions.assertEquals(3, map.get("C"));
    }

}
