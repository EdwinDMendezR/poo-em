package patrones.comportamiento.template.method;

abstract class PizzaMaker {

    //Template method
    final void makePizza() {
        prepareDough();
        addIngredients();
        bakePizza();
    }
    abstract void prepareDough();
    abstract void addIngredients();
    void bakePizza() {
        System.out.println("Baking the pizza at 400 degrees for 20 minutes");
    }

}