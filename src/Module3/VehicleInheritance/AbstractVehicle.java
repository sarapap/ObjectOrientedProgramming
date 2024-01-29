package Module3.VehicleInheritance;

abstract class AbstractVehicle implements Vehicle {
    protected double speed;
    protected String model;

    public AbstractVehicle(double speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    abstract void getSpeed();
    abstract void getModel();
}
