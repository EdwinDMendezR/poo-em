package patrones.estructura.decorator;

public class CanelaDecorator extends Cafe {

    private Cafe cafe;

    public CanelaDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 0.75;
    }

}
