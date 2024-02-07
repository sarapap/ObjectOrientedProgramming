package Module3.ElectricVehicles;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car(60, "Toyota", 30.1);
        Motorcycle motorcycle = new Motorcycle(80, "Honda Super Cub");
        Bus bus = new Bus(50, "Mercedes Benz");
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle(80, "BMW");
        ElectricCar electricCar = new ElectricCar(70, "Audi");

        car.start();
        car.stop();
        car.getSpeed();
        car.charge();
        car.getInfo();
        car.getModel();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getSpeed();
        motorcycle.charge();
        motorcycle.getInfo();
        motorcycle.getModel();
        bus.start();
        bus.stop();
        bus.getSpeed();
        bus.charge();
        bus.getInfo();
        bus.getModel();
        electricCar.start();
        electricCar.stop();
        electricCar.getSpeed();
        electricCar.charge();
        electricCar.getInfo();
        electricCar.getModel();
        electricMotorcycle.start();
        electricMotorcycle.stop();
        electricMotorcycle.getSpeed();
        electricMotorcycle.charge();
        electricMotorcycle.getInfo();
        electricMotorcycle.getModel();
    }
}
