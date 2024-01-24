package Module2.CruiseControl;

public class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private boolean cruiseControl;
    private float cruiseControlSpeed;


    public Car(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
        cruiseControl = false;
        cruiseControlSpeed = 0;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            adjustSpeed();
        }
        else {
            speed = 0;
        } }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
            adjustSpeed();
        } else {
            speed = 0; }
    }


    public boolean setCruiseControlSpeed(float targetSpeed) {
        if (targetSpeed >= 30 && targetSpeed <= 120) {
            cruiseControlSpeed = targetSpeed;
            return true;
        } else {
            return false;
        }
    }

    public float getCruiseControlSpeed() {
        return cruiseControlSpeed;
    }


    public void turnOffControl() {
        cruiseControl = false;
        System.out.println("\nCruise control is OFF");
    }

    public boolean turnOnControl(float targetSpeed) {
        if (cruiseControl = false || targetSpeed < 30 || targetSpeed > 120) {
            System.out.println("Cruise Control can not be turned on since the target speed is not met.\n");
            return false;
        }
        cruiseControl = true;
        cruiseControlSpeed = targetSpeed;
        System.out.println("Cruise control is ON\n");
        return true;
    }

    private void adjustSpeed() {
        if (cruiseControl && speed < cruiseControlSpeed) {
            speed = Math.min(speed +5, cruiseControlSpeed);
        } else if (cruiseControl && speed > cruiseControlSpeed) {
            speed = Math.min(speed - 5, cruiseControlSpeed);
        }
    }

    float getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    float getGasolineLevel() {
        return gasolineLevel;
    }
}

