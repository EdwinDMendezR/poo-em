package patrones.comportamiento.visitor;

public class Software extends Producto {
    private String sistemaOperativo;

    public Software(String nombre, double precio, String sistemaOperativo) {
        super(nombre, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}
