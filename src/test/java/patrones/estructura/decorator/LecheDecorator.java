package patrones.estructura.decorator;

public class LecheDecorator extends Cafe {

    private Cafe cafe;

    public LecheDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 0.50;
    }

}
