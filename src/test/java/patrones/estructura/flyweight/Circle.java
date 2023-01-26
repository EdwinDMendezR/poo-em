package patrones.estructura.flyweight;

import java.util.HashMap;

public class Circle implements Shape{

    private int x, y, radius;
    private String color;
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    private Circle(String color) {
        this.color = color;
    }

    public static Circle getCircle(String color) {
        Circle circle = circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public void drawFlyweight() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }

}
