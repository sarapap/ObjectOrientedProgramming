package Module3.VehicleInterfaces;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting... ");
    }
    @Override
    public void stop() {
        System.out.println("Car is stopping... ");
    }

    public void getInfo() {
        System.out.println("\nCar information: ");
        System.out.println("Type: Car");
        System.out.println("Fuel: Petrol");
        System.out.println("Color: Red");
    }
}
