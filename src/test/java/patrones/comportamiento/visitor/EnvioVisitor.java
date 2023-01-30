package patrones.comportamiento.visitor;

public class EnvioVisitor implements Visitor {

    @Override
    public void visitar(Libro libro) {
        double envio = 5.00;
        System.out.println("Costo de envío para el libro " + libro.getNombre() + ": " + envio);
    }

    @Override
    public void visitar(Software software) {
        double envio = 2.50;
        System.out.println("Costo de envío para el software " + software.getNombre() + ": " + envio);

    }

}
