package patrones.estructura.bridge;

public class LienzoAdapter {
    private Dibujo dibujo;

    public LienzoAdapter(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    public void dibujar() {
        System.out.println(dibujo.dibujarCirculo());
        System.out.println(dibujo.dibujarRectangulo());
    }
}
