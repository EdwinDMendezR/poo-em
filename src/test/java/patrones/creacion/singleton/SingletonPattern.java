package patrones.creacion.singleton;

import org.junit.jupiter.api.Test;

public class SingletonPattern {

    @Test
    public void methodTest() {

        // Arrange
        // Act
        DBConnection connection = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();

        // Assert

    }

}
