package patrones.estructura.flyweight;

import org.junit.jupiter.api.Test;

public class FlyWeightPattern {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    @Test
    public void methodTest() {

        // Arrange
        for(int i=0; i < 20; ++i) {
            Circle circle = Circle.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.drawFlyweight();
        }

        // Act

        // Assert

    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
