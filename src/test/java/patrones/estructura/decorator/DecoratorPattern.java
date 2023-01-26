package patrones.estructura.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecoratorPattern {

    @Test
    public void methodTest() {

        // Arrange
        // Act
        Cafe cafe = new Cafe();

        // Assert
        Assertions.assertEquals(3.5, cafe.getPrecio());

    }

    @Test
    public void methodTestDos() {

        // Arrange
        Cafe cafe = new Cafe();

        // Act
        cafe = new LecheDecorator(cafe);
        cafe = new ChocolateDecorator(cafe);
        cafe = new CanelaDecorator(cafe);

        // Assert
        Assertions.assertEquals(5.75, cafe.getPrecio());

    }


}
