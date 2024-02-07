package Module3.FuelEfficiency;


public class Motorcycle extends AbstractVehicle {
    public Motorcycle(double speed, String model, double fuelConsumed) {
        super(speed, model, fuelConsumed);
    }
    public void start() {
        System.out.println("\nMotorcycle is starting... ");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping... ");
    }

    public String getInfo() {
        return "\nMotorcycle information: " +
                "Type: Motorcycle" + "Fuel: Gasoline" +
                "Color: Black";
    }

    public void getSpeed() {
        System.out.println("The speed of the motorcycle is: " + speed + " km/h");
    }

    public void getModel() {
        System.out.println("The model of the motorcycle is: " + model);
    }
    public void charge() {
        System.out.println("Not possible to charge.");
    }

    public double calculateFuelEfficiency(double distance) {
        double litersPerKm = fuelConsumed / distance;
        return litersPerKm;
    }

}
