package Module3.ElectricVehicles;


public class Motorcycle extends AbstractVehicle {
    public Motorcycle(double speed, String model) {
        super(speed, model);
    }
    public void start() {
        System.out.println("\nMotorcycle is starting... ");
    }

    public void stop() {
        System.out.println("Motorcycle is stopping... ");
    }

    public void getInfo() {
        System.out.println("\nMotorcycle information: ");
        System.out.println("Type: Motorcycle");
        System.out.println("Fuel: Gasoline");
        System.out.println("Color: Black");
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
}
