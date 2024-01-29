package Module3.Bus;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;
        Bus myBus;

        myCar = new Car("Toyota Corolla");
        myBus = new Bus("Bus");
        myCar.fillTank();
        myBus.fillTank();

        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        for (int j = 0; j < 6; j++) {
            myBus.passengerEnter(6);
            System.out.println("Amount of passengers in the bus: " + myBus.getPassengers());
        }

        for (int j = 0; j < 6; j++) {
            myBus.passengerExit(3);
            System.out.println("Amount of passengers in the bus after exiting " + myBus.getPassengers());
        }
    }
}
