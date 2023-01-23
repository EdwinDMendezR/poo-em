package variables.instancia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VariablesInstanciaTest {

    class ClaseO {
        String variableInstancia;

        public ClaseO(String value) {
            setVariableInstancia(value);
        }

        public String generarMensaje() {
            return "****** " + variableInstancia;
        }

        public void setVariableInstancia(String variableInstancia) {
            this.variableInstancia = variableInstancia;
        }
    }


    @Test
    public void methodTest() {
        ClaseO claseO = new ClaseO("Value");
        Assertions.assertEquals("****** Value", claseO.generarMensaje());
    }

}
