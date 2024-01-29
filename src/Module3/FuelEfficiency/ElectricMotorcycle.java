package Module3.FuelEfficiency;

public class ElectricMotorcycle extends AbstractVehicle {
    public ElectricMotorcycle(double speed, String model, double value) {
        super(speed, model, value);
    }
    public void start() {
        System.out.println("\nElectric Motorcycle is starting... ");
    }

    public void stop() {
        System.out.println("Electric Motorcycle is stopping... ");
    }

    public void getInfo() {
        System.out.println("\nElectric Motorcycle information: ");
        System.out.println("Type: Electric Motorcycle");
        System.out.println("Battery: Electricity");
        System.out.println("Color: Blue");
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



}
