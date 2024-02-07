package Module3.FuelEfficiency;

public class Car extends AbstractVehicle {
    public Car(double speed, String model, double fuelConsumed) {
        super(speed, model, fuelConsumed);
    }
    public void start() {
        System.out.println("Car is starting... ");
    }

    public void stop() {
        System.out.println("Car is stopping... ");
    }

    public String getInfo() {
        return "\n Car information: " +
                "Type: Car" + "Fuel: Petrol" +
                "Color: Red";
    }



    public void getSpeed() {
        System.out.println("The speed of the car is: " + speed + " km/h");
    }

    public void getModel() {
        System.out.println("The model of the car is: " + model);
    }

    public void charge() {
        System.out.println("Not possible to charge.");
    }

    public double calculateFuelEfficiency(double distance) {
        double litersPerKm = fuelConsumed / distance;
        return litersPerKm;
    }

}
