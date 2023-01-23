package clase.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InterfaceClassTest {

    interface InterfaceClase {
        String getNombre();
    }

    class Implementacion implements InterfaceClase {

        @Override
        public String getNombre() {
            return "Implementacion";
        }
    }

    @Test
    public void methodTest() {
        InterfaceClase interfaceClase = new Implementacion();
        Assertions.assertEquals("Implementacion", interfaceClase.getNombre());
    }

}
