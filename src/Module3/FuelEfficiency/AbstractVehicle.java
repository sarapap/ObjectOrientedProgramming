package Module3.FuelEfficiency;


abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected double speed;
    protected String model;
    protected double fuelConsumed;

    public AbstractVehicle(double speed, String model, double fuelConsumed) {
        this.speed = speed;
        this.model = model;
        this.fuelConsumed = fuelConsumed;
    }

    abstract void getSpeed();
    abstract void getModel();

    public double calculateFuelEfficiency() {
        return fuelConsumed;
    }

}

