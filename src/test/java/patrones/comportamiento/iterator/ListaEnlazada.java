package patrones.comportamiento.iterator;

import java.util.Iterator;

public class ListaEnlazada {

    Nodo cabeza;

    public Iterator<Object> iterator() {
        return new IteradorListaEnlazada(this);
    }

}
