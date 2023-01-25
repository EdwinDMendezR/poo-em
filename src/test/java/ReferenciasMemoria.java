import org.junit.jupiter.api.Test;

public class ReferenciasMemoria {


    class ClaseA {
        String value = "A";
        int valueInt = 1;
        Integer integer = 2;
        Boolean aBoolean = false;
        boolean aBooleana = false;
    }


    class ClaseB {
        String value = "A";
        int valueInt = 1;
        Integer integer = 2;
        Boolean aBoolean = false;
        boolean aBooleana = false;
    }

    @Test
    public void methodTest() {
        ClaseA claseA = new ClaseA();
        ClaseB claseB = new ClaseB();
    }

}
