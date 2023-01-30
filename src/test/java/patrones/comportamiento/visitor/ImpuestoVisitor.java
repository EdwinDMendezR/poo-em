package patrones.comportamiento.visitor;

public class ImpuestoVisitor implements Visitor {
    public void visitar(Libro libro) {
        double impuesto = libro.getPrecio() * 0.10;
        System.out.println("Impuesto para el libro " + libro.getNombre() + ": " + impuesto);
    }

    public void visitar(Software software) {
        double impuesto = software.getPrecio() * 0.15;
        System.out.println("Impuesto para el software " + software.getNombre() + ": " + impuesto);
    }
}
