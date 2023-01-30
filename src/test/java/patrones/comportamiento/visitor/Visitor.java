package patrones.comportamiento.visitor;

public interface Visitor {
    void visitar(Libro libro);
    void visitar(Software software);
}
