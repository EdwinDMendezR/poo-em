package patrones.comportamiento.iterator;

import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class IteratorPattern {

    @Test
    public void methodTest() {

        // Crear una nueva lista enlazada
        ListaEnlazada lista = new ListaEnlazada();

        // Agregar algunos elementos a la lista
        lista.cabeza = new Nodo("Perro");
        lista.cabeza.siguiente = new Nodo("Gato");
        lista.cabeza.siguiente.siguiente = new Nodo("Ratón");

        // Obtener el iterador de la lista
        Iterator<Object> iterador = lista.iterator();

        // Recorrer la lista utilizando el iterador
        while (iterador.hasNext()) {
            Object elemento = iterador.next();
            System.out.println(elemento);
        }

    }

}
