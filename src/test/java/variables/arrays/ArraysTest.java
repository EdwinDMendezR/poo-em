package variables.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {

    @Test
    public void methodTest() {
        String[] strings = new String[2];
        strings[0] = "A";
        strings[1] = "B";
        Assertions.assertEquals("A", strings[0]);
    }

}
