package Module3.FuelEfficiency;


public class Bus extends AbstractVehicle {
    public Bus(double speed, String model, double fuelConsumed) {
        super(speed, model, fuelConsumed);
    }

    public void start() {
        System.out.println("\nBus is starting... ");
    }

    public void stop() {
        System.out.println("Bus is stopping... ");
    }

    public String getInfo() {
        return "\nBus information: " +
                "Type: Bus" + "Fuel: Diesel" +
                "Capacity: 40 passengers";
    }

    public double calculateFuelEfficiency(double distance) {
        double litersPerKm = fuelConsumed / distance;
        return litersPerKm;
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

}
