package patrones.comportamiento.template.method;

public class PepperoniPizza extends PizzaMaker {

    @Override
    void prepareDough() {
        System.out.println("Preparing dough with flour, water, yeast, salt and spices");
    }

    @Override
    void addIngredients() {
        System.out.println("Adding tomato sauce, mozzarella cheese, pepperoni and red pepper flakes");
    }

}