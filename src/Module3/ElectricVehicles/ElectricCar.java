package Module3.ElectricVehicles;

public class ElectricCar extends AbstractVehicle {
    public ElectricCar(double speed, String model) {
        super(speed, model);
    }
    public void start() {
        System.out.println("\nElectric Car is starting... ");
    }

    public void stop() {
        System.out.println("Electric Car is stopping... ");
    }

    public void getInfo() {
        System.out.println("\nElectric Car information: ");
        System.out.println("Type: Electric Car");
        System.out.println("Battery: Electricity");
        System.out.println("Color: Yellow");
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
}
