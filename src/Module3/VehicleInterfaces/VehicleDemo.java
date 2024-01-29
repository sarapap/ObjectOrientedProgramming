package Module3.VehicleInterfaces;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bus bus = new Bus();

        car.start();
        car.stop();
        car.getInfo();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        bus.start();
        bus.stop();
        bus.getInfo();
    }
}
