package patrones.comportamiento.mediador;

import org.junit.jupiter.api.Test;

public class MediadorPattern {

    @Test
    public void methodTest() {

        MediadorChat mediador = new MediadorChat();
        Usuario user1 = new Usuario("Juan", mediador);
        Usuario user2 = new Usuario("Pedro", mediador);
        Usuario user3 = new Usuario("Maria", mediador);

        user1.enviarMensaje("Pedro", "Hola Pedro, ¿cómo estás?");
        user2.enviarMensaje("Maria", "Hola Maria, ¿qué tal tu día?");
        user3.enviarMensaje("Juan", "Hola Juan, todo bien, gracias ¿y tú?");

    }

}
