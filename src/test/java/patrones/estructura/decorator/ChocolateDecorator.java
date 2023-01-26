package patrones.estructura.decorator;

public class ChocolateDecorator extends Cafe {
    private Cafe cafe;

    public ChocolateDecorator(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio() + 1.00;
    }

}
