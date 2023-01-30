package patrones.comportamiento.state;

import org.junit.jupiter.api.Test;

public class StatePattern {

    @Test
    public void methodTest() {

        // Arrange

        MaquinaExpendedora maquina = new MaquinaExpendedora();

        maquina.setEstado(new Inactivo());
        maquina.insertarMoneda();
        maquina.elegirBebida();
        maquina.entregarBebida();
        System.out.println();

        maquina.setEstado(new Activo());
        maquina.insertarMoneda();
        maquina.elegirBebida();
        maquina.entregarBebida();
        System.out.println();

        maquina.setEstado(new SinMonedas());
        maquina.insertarMoneda();
        maquina.elegirBebida();
        maquina.entregarBebida();
        System.out.println();

        maquina.setEstado(new ConMonedas());
        maquina.insertarMoneda();
        maquina.elegirBebida();
        maquina.entregarBebida();
        System.out.println();

        // Act

        // Assert

    }

}
