package patrones.creacion.builder;

import org.junit.jupiter.api.Test;

public class BuilderPattern {

    @Test
    public void methodTest() {

        // Arrange
        // Act
        Computadora miComputadora = new ComputadoraBuilder()
                .conProcesador("Intel i7")
                .conMemoriaRAM(16)
                .conAlmacenamiento(1024)
                .conTarjetaGrafica(true)
                .build();
        // Assert

    }

}
