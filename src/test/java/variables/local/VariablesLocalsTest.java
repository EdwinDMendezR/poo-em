package variables.local;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VariablesLocalsTest {

    class ClaseX {
        private String value;

        public ClaseX(String value) {
            this.value = value;
        }

        public String getValue() {
            String variableLocal = " - X";
            return value.concat(variableLocal);
        }
    }

    @Test
    public void methodTest() {
        ClaseX claseX = new ClaseX("Value");
        Assertions.assertEquals("Value - X", claseX.getValue());
    }

}
