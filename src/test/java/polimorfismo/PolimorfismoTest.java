package polimorfismo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PolimorfismoTest {

    class Animal {
        public String sonido() {
            return "?";
        }
    }

    class AnimalA extends Animal {
        public String sonido() {
            return "A";
        }
    }

    class AnimalB extends Animal {
        public String sonido() {
            return "B";
        }
    }

    @Test
    public void animalA() {
        Assertions.assertEquals("A", new AnimalA().sonido());
    }

    @Test
    public void animalB() {
        Assertions.assertEquals("B", new AnimalB().sonido());
    }

    @Test
    public void animal() {
        Assertions.assertEquals("?", new Animal().sonido());
    }

}
