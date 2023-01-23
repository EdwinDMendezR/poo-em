package accesos.finals.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccesoFinalTest {

    class ClaseA {
        final String getValue() {
            return "ValueA";
        }
    }

    class ClaseB extends ClaseA {

        /** 'getValue()' cannot override 'getValue()' in
         * 'accesos.finals.tests.AccesoFinalTest.ClaseA';
         * overridden method is final */
        //public String getValue() {}
    }

    @Test
    public void methodTest() {
        ClaseB claseB = new ClaseB();
        Assertions.assertEquals("ValueA", claseB.getValue());
    }

}
