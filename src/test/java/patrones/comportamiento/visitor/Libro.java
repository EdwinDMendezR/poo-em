package patrones.comportamiento.visitor;

class Libro extends Producto {
    private String autor;

    public Libro(String nombre, double precio, String autor) {
        super(nombre, precio);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}