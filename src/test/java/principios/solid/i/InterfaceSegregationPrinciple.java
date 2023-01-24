package principios.solid.i;

public class InterfaceSegregationPrinciple {

    interface Shape {
        double area();
    }

    interface Rectangle extends Shape {
        double getWidth();
        double getHeight();
        void setWidth(double width);
        void setHeight(double height);
    }

    interface Circle extends Shape {
        double getRadius();
        void setRadius(double radius);
    }

}
