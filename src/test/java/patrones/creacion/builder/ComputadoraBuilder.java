package patrones.creacion.builder;

public class ComputadoraBuilder {

    private String procesador;
    private int memoriaRAM;
    private int almacenamiento;
    private boolean tieneTarjetaGrafica;

    public ComputadoraBuilder conProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public ComputadoraBuilder conMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
        return this;
    }

    public ComputadoraBuilder conAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
        return this;
    }

    public ComputadoraBuilder conTarjetaGrafica(boolean tieneTarjetaGrafica) {
        this.tieneTarjetaGrafica = tieneTarjetaGrafica;
        return this;
    }

    public Computadora build() {
        return new Computadora(procesador, memoriaRAM, almacenamiento, tieneTarjetaGrafica);
    }

}
