package accesos.privado.tests;

import accesos.privado.externo.PrivateMethod;
import org.junit.jupiter.api.Test;

public class AccesoPrivateTest {

    @Test
    public void methodTest() {
        PrivateMethod method = new PrivateMethod("Value");
        //method.setValue(); genera error por que no puede acceder al metodo
    }

}
