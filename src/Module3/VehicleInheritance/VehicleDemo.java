package Module3.VehicleInheritance;


public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car(60, "Toyota");
        Motorcycle motorcycle = new Motorcycle(80, "Honda Super Cub");
        Bus bus = new Bus(50, "Mercedes Benz");

        car.start();
        car.stop();
        car.getSpeed();
        car.getInfo();
        car.getModel();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getSpeed();
        motorcycle.getInfo();
        motorcycle.getModel();
        bus.start();
        bus.stop();
        bus.getSpeed();
        bus.getInfo();
        bus.getModel();
    }
}
