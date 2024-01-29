package Module3.SportsCar;

public class CarTest {

    public static void main(String[] args) {
        Car myCar;
        SportsCar mySportsCar;

        myCar = new Car("Toyota Corolla");
        mySportsCar = new SportsCar("Ferrari");
        myCar.fillTank();
        mySportsCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        for (int j = 0; j < 6; j++) {
            mySportsCar.accelerate();
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }

        while(mySportsCar.getSpeed() > 0) {
            mySportsCar.decelerate(15);
            System.out.println(mySportsCar.getTypeName() + ": speed is " + mySportsCar.getSpeed() + " km/h");
        }
    }
}
