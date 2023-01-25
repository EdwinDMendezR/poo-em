package patrones.estructura.bridge;

import org.junit.jupiter.api.Test;

public class AdapterPattern {

    @Test
    public void methodTest() {
        // Arrange
        // Act
        Dibujo vectorial = new DibujoVectorial();
        LienzoAdapter lienzo1 = new LienzoAdapter(vectorial);
        lienzo1.dibujar();
        // Assert
    }

    @Test
    public void methodTestDos() {
        // Arrange
        // Act
        Dibujo raster = new DibujoRaster();
        LienzoAdapter lienzo2 = new LienzoAdapter(raster);
        lienzo2.dibujar();
        // Assert
    }


}
