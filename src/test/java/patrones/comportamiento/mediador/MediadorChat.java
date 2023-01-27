package patrones.comportamiento.mediador;

import java.util.ArrayList;
import java.util.List;

public class MediadorChat {
    private List<Usuario> usuarios = new ArrayList<>();

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void enviarMensaje(Usuario remitente, String destinatario, String mensaje) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(destinatario)) {
                usuario.recibirMensaje(remitente.getNombre() + ": " + mensaje);
                break;
            }
        }
    }
}
