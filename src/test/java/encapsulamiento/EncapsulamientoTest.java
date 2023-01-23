package encapsulamiento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EncapsulamientoTest {

    class EncapsulamientoEjemplo {

        private int saldo;

        public int getSaldo() {
            return saldo;
        }

        public void setSaldo(int saldo) {
            this.saldo = saldo;
        }

    }

    @Test
    public void methodTest() {
        EncapsulamientoEjemplo ejemplo = new EncapsulamientoEjemplo();
        ejemplo.setSaldo(2000);
        Assertions.assertEquals(2000, ejemplo.getSaldo());
    }

}
