package patrones.comportamiento.state;

public class MaquinaExpendedora {

    private EstadoMaquina estado;

    public MaquinaExpendedora() {
        this.estado = new Inactivo();
    }

    public void setEstado(EstadoMaquina estado) {
        this.estado = estado;
    }

    public void insertarMoneda() {
        estado.insertarMoneda();
    }

    public void elegirBebida() {
        estado.elegirBebida();
    }

    public void entregarBebida() {
        estado.entregarBebida();
    }

}
