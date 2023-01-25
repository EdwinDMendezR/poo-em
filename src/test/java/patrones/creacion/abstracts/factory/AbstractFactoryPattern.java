package patrones.creacion.abstracts.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AbstractFactoryPattern {

    @Test
    public void methodTest() {

        // Arrange
        // Act
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        Shape shape2 = shapeFactory.getShape("SQUARE");

        // Assert
        Assertions.assertEquals("Circle", shape1.draw());
        Assertions.assertEquals("Square", shape2.draw());

    }

    @Test
    public void methodTestColor() {

        // Arrange
        // Act
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorFactory.getColor("RED");
        Color color2 = colorFactory.getColor("BLUE");

        // Assert
        Assertions.assertEquals("Red", color1.fill());
        Assertions.assertEquals("Blue", color2.fill());

    }


}
