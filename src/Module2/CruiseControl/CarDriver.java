package Module2.CruiseControl;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        System.out.println("\nTesting of Cruise Control.");

        myCar.turnOnControl(80); // target speed

        while (myCar.getSpeed() < myCar.getCruiseControlSpeed()) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + " speed is " + myCar.getSpeed() + " km/h.");
        }

        while (myCar.getSpeed() > myCar.getCruiseControlSpeed()) {
            myCar.decelerate(10);
            System.out.println(myCar.getTypeName() + " speed is " + myCar.getSpeed() + " km/h.");
        }

        myCar.turnOffControl();

        /* Modifying the CarDriver class first helps to define the new implementations to the Car class
        when you know what needs to be added.
         */
    }
}
