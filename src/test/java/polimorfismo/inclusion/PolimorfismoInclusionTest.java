package polimorfismo.inclusion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PolimorfismoInclusionTest {

    abstract class ObjectPrincipal {
        public abstract String getName();
    }

    class ObjectA extends ObjectPrincipal {
        @Override
        public String getName() {
            return "getName()";
        }
    }


    @Test
    public void methodTest() {
        Assertions.assertEquals("getName()", new ObjectA().getName());
    }

}
