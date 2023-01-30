package patrones.comportamiento.state;

public class SinMonedas implements EstadoMaquina {

    @Override
    public void insertarMoneda() {
        System.out.println("Moneda insertada");
    }

    @Override
    public void elegirBebida() {
        System.out.println("La máquina no ha recibido monedas");
    }

    @Override
    public void entregarBebida() {
        System.out.println("La máquina no ha recibido monedas");
    }

}