package abstracion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstracionTest {

    abstract class AnimalAbstracion {

        private String nombre;

        public AnimalAbstracion(String nombre) {
            this.nombre = nombre;
        }

        public abstract String methodoX();

        public String getNombre() {
            return this.nombre;
        }

    }

    class Perro extends AnimalAbstracion {

        public Perro(String nombre) {
            super(nombre);
        }

        @Override
        public String methodoX() {
            return getNombre();
        }

    }


    @Test
    public void methodTest() {
        Assertions.assertEquals("ZS", new Perro("ZS").methodoX());
    }

}
