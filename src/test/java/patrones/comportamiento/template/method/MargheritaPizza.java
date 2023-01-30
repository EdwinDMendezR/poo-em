package patrones.comportamiento.template.method;

public class MargheritaPizza extends PizzaMaker {

    @Override
    void prepareDough() {
        System.out.println("Preparing dough with flour, water, yeast and salt");
    }

    @Override
    void addIngredients() {
        System.out.println("Adding tomato sauce, mozzarella cheese, and fresh basil");
    }

}