package patrones.creacion.abstracts.factory;

public interface AbstractFactory {
    Shape getShape(String shapeType);
    Color getColor(String colorType);
}
