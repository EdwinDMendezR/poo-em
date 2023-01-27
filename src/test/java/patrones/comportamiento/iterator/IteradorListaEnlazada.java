package patrones.comportamiento.iterator;

import java.util.Iterator;

public class IteradorListaEnlazada implements Iterator<Object> {

    ListaEnlazada lista;
    Nodo actual;

    public IteradorListaEnlazada(ListaEnlazada lista) {
        this.lista = lista;
        this.actual = lista.cabeza;
    }

    public boolean hasNext() {
        return actual != null;
    }

    public Object next() {
        Object valor = actual.valor;
        actual = actual.siguiente;
        return valor;
    }

}
