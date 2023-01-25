package patrones.creacion.prototype;

public class AnimalCloner {

    private AnimalPrototype prototype;

    public AnimalCloner(AnimalPrototype prototype) {
        this.prototype = prototype;
    }

    public AnimalPrototype cloneAnimal() {
        return prototype.clone();
    }

}
