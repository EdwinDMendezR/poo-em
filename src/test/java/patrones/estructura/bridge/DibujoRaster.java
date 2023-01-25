package patrones.estructura.bridge;

public class DibujoRaster implements Dibujo {

    @Override
    public String dibujarCirculo() {
        return "Circulo Raster";
    }

    @Override
    public String dibujarRectangulo() {
        return "Rectangulo Raster";
    }

}
