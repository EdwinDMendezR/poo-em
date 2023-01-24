package principios.solid.o;

public class OpenClosedPrinciple {

    abstract class Shape {
        public abstract double area();
    }

    class Rectangle extends Shape {
        private final double width;
        private final double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double area() {
            return width * height;
        }
    }

    class Circle extends Shape {
        private final double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }


}
