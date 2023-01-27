package patrones.comportamiento.mediador;

public class Usuario {

    private String nombre;
    private MediadorChat mediador;

    public Usuario(String nombre, MediadorChat mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
        mediador.registrarUsuario(this);
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        mediador.enviarMensaje(this, destinatario, mensaje);
    }

    public void recibirMensaje(String mensaje) {
        System.out.println(nombre + " recibió: " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }

}
