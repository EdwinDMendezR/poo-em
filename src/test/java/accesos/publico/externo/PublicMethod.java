package accesos.publico.externo;

public class PublicMethod {

    private  String nombre;

    public PublicMethod(String value) {
        setNombre(value);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
