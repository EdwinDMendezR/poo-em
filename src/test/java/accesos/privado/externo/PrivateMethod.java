package accesos.privado.externo;

public class PrivateMethod {

    private String value;

    public PrivateMethod(String value) {
        setValue(value);
    }

    private void setValue(String value) {
        this.value = value;
    }

}
