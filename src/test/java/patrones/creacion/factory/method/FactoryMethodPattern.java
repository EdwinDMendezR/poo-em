package patrones.creacion.factory.method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryMethodPattern {

    @Test
    public void carMethod() {

        // Arrange
        // Act
        Vehicle car = VehicleFactory.getVehicle("CAR");

        // Assert
        Assertions.assertEquals("Driving a car", car.drive());
    }

    @Test
    public void bikeMethod() {

        // Arrange
        // Act
        Vehicle bike = VehicleFactory.getVehicle("BIKE");

        // Assert
        Assertions.assertEquals("Riding a bike", bike.drive());
    }

}
