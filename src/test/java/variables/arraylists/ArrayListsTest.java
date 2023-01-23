package variables.arraylists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ArrayListsTest {

    @Test
    public void methodTest() {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        Assertions.assertEquals("A", strings.get(0));
    }

}
