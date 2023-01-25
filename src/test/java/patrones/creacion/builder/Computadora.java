package patrones.creacion.builder;

public class Computadora {

    private String procesador;
    private int memoriaRAM;
    private int almacenamiento;
    private boolean tieneTarjetaGrafica;

    public Computadora(String procesador, int memoriaRAM, int almacenamiento, boolean tieneTarjetaGrafica) {
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.tieneTarjetaGrafica = tieneTarjetaGrafica;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public boolean tieneTarjetaGrafica() {
        return tieneTarjetaGrafica;
    }

}
