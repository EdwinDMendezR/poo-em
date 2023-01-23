package clase.finals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FinalTest {

    final class Sistema {
        final  String getNombre() {
            return "Sistema";
        }
    }

    @Test
    public void methodTest() {
        Assertions.assertEquals("Sistema", new Sistema().getNombre());
    }

}
