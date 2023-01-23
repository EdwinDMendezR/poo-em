package herencia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HerenciaTest {

    abstract class AnimalHerencia {

        private String nombre;

        public AnimalHerencia(String nombre) {
            this.nombre = nombre;
        }

        public abstract String methodoX();

        public String getNombre() {
            return this.nombre;
        }

    }

    class Perro extends AnimalHerencia {

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
        Assertions.assertEquals("Herencia", new Perro("Herencia").methodoX());
    }

}
