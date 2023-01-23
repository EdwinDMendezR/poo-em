package clase.statics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StaticClassTest {

    static class Sistemas {
        static String getNombre() {
            return "Sistemas";
        }
    }

    @Test
    public void methodTest() {
        Assertions.assertEquals("Sistemas", Sistemas.getNombre());
    }

}
