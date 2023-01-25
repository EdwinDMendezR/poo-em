package patrones.estructura.bridge;

public class DibujoVectorial implements Dibujo {

    @Override
    public String dibujarCirculo() {
        return "Circulo Vectorial";
    }

    @Override
    public String dibujarRectangulo() {
        return "Rectangulo Vectorial";
    }

}
