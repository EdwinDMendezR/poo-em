package variables.finals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VariablesFinalTest {

    class ObjectA {

        final String value;

        ObjectA(String value) {
            this.value = value;
        }


    }


    @Test
    public void methodTest() {
        ObjectA objectA = new ObjectA("Value");
        // Cannot assign a value to final variable 'value'
        //objectA.value = "New Value";
        Assertions.assertEquals("Value", objectA.value);
    }

}
