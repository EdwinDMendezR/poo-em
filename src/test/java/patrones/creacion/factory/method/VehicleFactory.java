package patrones.creacion.factory.method;

public final class VehicleFactory {

    public static Vehicle getVehicle(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (type.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }

}
