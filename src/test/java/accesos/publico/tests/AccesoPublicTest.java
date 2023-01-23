package accesos.publico.tests;

import accesos.publico.externo.PublicMethod;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccesoPublicTest {

    @Test
    public void methodTest() {
        PublicMethod method = new PublicMethod("Value");
        Assertions.assertEquals("Value", method.getNombre());
    }

}
