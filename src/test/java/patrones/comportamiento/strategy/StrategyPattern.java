package patrones.comportamiento.strategy;

import org.junit.jupiter.api.Test;

public class StrategyPattern {

    @Test
    public void methodTest() {

        // Arrange
        Context context = new Context(new AdditionStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new SubtractionStrategy());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        // Act

        // Assert

    }

}
