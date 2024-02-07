package Module3.FuelEfficiency;

public class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle(double speed, String model, double fuelConsumed) {
        super(speed, model, fuelConsumed);
    }
    public void start() {
        System.out.println("\nElectric Motorcycle is starting... ");
    }

    public void stop() {
        System.out.println("Electric Motorcycle is stopping... ");
    }

    public String getInfo() {
        return "\nElectric Car information: " +
                "Type: Electric Motorcycle" + "Battery: Electricity" +
                "Color: Blue";
    }

    public void getSpeed() {
        System.out.println("The speed of the electric motorcycle is: " + speed + " km/h");
    }

    public void getModel() {
        System.out.println("The model of the electric motorcycle is: " + model);
    }

    public void charge() {
        System.out.println("Charging... ");
    }

    public double calculateFuelEfficiency(double distance) {
        double energyConsumed = distance / fuelConsumed;
        return energyConsumed;
    }



}
