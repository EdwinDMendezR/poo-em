package clase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClaseTest {

    class Clase {

        private String atributo;

        public String getAtributo() {
            return atributo;
        }

        public void setAtributo(String atributo) {
            this.atributo = atributo;
        }

    }

    @Test
    public void methodTest() {
        Clase clase = new Clase();
        clase.setAtributo("string");
        Assertions.assertEquals("string", clase.getAtributo());
    }

}
