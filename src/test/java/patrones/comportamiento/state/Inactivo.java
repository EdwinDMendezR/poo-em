package patrones.comportamiento.state;

public class Inactivo implements EstadoMaquina {

    @Override
    public void insertarMoneda() {
        System.out.println("La máquina no está activa");
    }

    @Override
    public void elegirBebida() {
        System.out.println("La máquina no está activa");
    }

    @Override
    public void entregarBebida() {
        System.out.println("La máquina no está activa");
    }

}
