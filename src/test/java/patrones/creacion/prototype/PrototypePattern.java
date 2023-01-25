package patrones.creacion.prototype;

import org.junit.jupiter.api.Test;

public class PrototypePattern {

    @Test
    public void methodTest() {

        Dog original = new Dog("Fido");
        AnimalCloner cloner = new AnimalCloner(original);
        Dog clone = (Dog) cloner.cloneAnimal();
        System.out.println("Name of original: " + original.getName());
        System.out.println("Name of clone: " + clone.getName());

    }

}
