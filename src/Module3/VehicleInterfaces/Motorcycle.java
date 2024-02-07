package Module3.VehicleInterfaces;

public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("\nMotorcycle is starting... ");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping... ");
    }

    public void getInfo() {
        System.out.println("\nMotorcycle information: ");
        System.out.println("Type: Motorcycle");
        System.out.println("Fuel: Gasoline");
        System.out.println("Color: Black");
    }
}
