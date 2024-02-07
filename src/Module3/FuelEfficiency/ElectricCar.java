package Module3.FuelEfficiency;

public class ElectricCar extends AbstractVehicle {
    public ElectricCar(double speed, String model, double fuelConsumed) {
        super(speed, model, fuelConsumed);
    }
    public void start() {
        System.out.println("\nElectric Car is starting... ");
    }

    public void stop() {
        System.out.println("Electric Car is stopping... ");
    }

    public String getInfo() {
        return "\nElectric Car information: " +
        "Type: Electric Car" + "Battery: Electricity" +
        "Color: Yellow";
    }

    public void getSpeed() {
        System.out.println("The speed of the electric car is: " + speed + " km/h");
    }

    public void getModel() {
        System.out.println("The model of the electric car is: " + model);
    }

    public void charge() {
        System.out.println("Charging... ");
    }

    public double calculateFuelEfficiency(double distance) {
        double energyConsumed = distance / fuelConsumed;
        return energyConsumed;
    }

}
