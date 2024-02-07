package Module3.FuelEfficiency;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car(60, "Toyota", 40);
        Motorcycle motorcycle = new Motorcycle(80, "Honda Super Cub", 30);
        Bus bus = new Bus(50, "Mercedes Benz", 30);
        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle(80, "BMW", 0.8);
        ElectricCar electricCar = new ElectricCar(70, "Audi",0.8);

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

        System.out.println("\nFuel efficiency of a bus (L/km): " + bus.calculateFuelEfficiency(60));
        System.out.println("Fuel efficiency of a car (L/km): " + car.calculateFuelEfficiency(80));
        System.out.println("Fuel efficiency of a motorcycle (L/km): " + motorcycle.calculateFuelEfficiency(120));
        System.out.println("Fuel efficiency of an electric car (kms per kWh): " + electricCar.calculateFuelEfficiency(80));
        System.out.println("Fuel efficiency of an electric motorcycle (kms per kWh): " + electricMotorcycle.calculateFuelEfficiency(100));

    }
}
