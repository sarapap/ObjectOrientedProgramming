package Module3.VehicleInheritance;


public class Car extends AbstractVehicle {
    public Car(double speed, String model) {
        super(speed, model);
    }
    @Override
    public void start() {
        System.out.println("Car is starting... ");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping... ");
    }

    public void getInfo() {
        System.out.println("\nCar information: ");
        System.out.println("Type: Car");
        System.out.println("Fuel: Petrol");
        System.out.println("Color: Red");
    }

    public void getSpeed() {
        System.out.println("The speed of the car is: " + speed + " km/h");
    }

    public void getModel() {
        System.out.println("The model of the car is: " + model);
    }
}
