package Module3.FuelEfficiency;


public class Bus extends AbstractVehicle {
    public Bus(double speed, String model, double value) {
        super(speed, model, value);
    }

    public void start() {
        System.out.println("\nBus is starting... ");
    }

    public void stop() {
        System.out.println("Bus is stopping... ");
    }

    public void getInfo() {
        System.out.println("\nBus information: ");
        System.out.println("Type: Bus");
        System.out.println("Fuel: Diesel");
        System.out.println("Capacity: 40 passengers");
    }

    public void getSpeed() {
        System.out.println("The speed of the bus is: " + speed + " km/h");
    }

    public void getModel() {
        System.out.println("The model of the bus is: " + model);
    }

    public void charge() {
        System.out.println("Not possible to charge.");
    }

    public void calculateFuelEfficiency() {
        System.out.println("Calculated fuel efficiency: " + value);
    }
}
