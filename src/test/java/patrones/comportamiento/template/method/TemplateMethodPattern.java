package patrones.comportamiento.template.method;

import org.junit.jupiter.api.Test;

public class TemplateMethodPattern {

    @Test
    public void methodTest() {

        // Arrange
        PizzaMaker margheritaPizza = new MargheritaPizza();
        margheritaPizza.makePizza();

        System.out.println("--------------------------------------");

        PizzaMaker pepperoniPizza = new PepperoniPizza();
        pepperoniPizza.makePizza();

        // Act

        // Assert

    }

}
