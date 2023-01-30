package patrones.comportamiento.state;

public class Activo implements EstadoMaquina {

    @Override
    public void insertarMoneda() {
        System.out.println("Moneda insertada");
    }

    @Override
    public void elegirBebida() {
        System.out.println("Bebida elegida");
    }

    @Override
    public void entregarBebida() {
        System.out.println("La máquina no ha recibido monedas");
    }

}