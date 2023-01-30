package patrones.comportamiento.visitor;

import org.junit.jupiter.api.Test;

public class VisitorPattern {

    @Test
    public void methodTest() {

        // Arrange
        Producto[] productos = {
                new Libro("El Quijote", 20.00, "Cervantes"),
                new Software("Windows 10", 150.00, "Microsoft")
        };

        // Act
        Visitor impuestoVisitor = new ImpuestoVisitor();
        Visitor envioVisitor = new EnvioVisitor();

        for (Producto producto : productos) {
            producto.aceptar(impuestoVisitor);
            producto.aceptar(envioVisitor);
            System.out.println("--------------------------------");
        }

        // Assert

    }

}
