package Module3.VehicleInterfaces;

public class Bus implements Vehicle {
    @Override
    public void start() {
        System.out.println("\nBus is starting... ");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stopping... ");
    }

    public void getInfo() {
        System.out.println("\nBus information: ");
        System.out.println("Type: Bus");
        System.out.println("Fuel: Diesel");
        System.out.println("Capacity: 40 passengers");
    }
}
