package Module3.FuelEfficiency;


abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected double speed;
    protected String model;
    protected double value; //fuel

    public AbstractVehicle(double speed, String model, double value) {
        this.speed = speed;
        this.model = model;
        this.value = value;
    }

    abstract void getSpeed();
    abstract void getModel();


    public double calculateFuelEfficiency() {
        return value;
    }
}

