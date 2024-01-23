package Module2;


public class ModifiedCar {
    private float speed;
    private float gasolineLevel;
    private String typeName;

    public ModifiedCar(String typeName, float gasolineTankCapacity, float topSpeed) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;

        if (gasolineTankCapacity > 0) {
            fillTank(gasolineTankCapacity);
        }

        if (topSpeed >= 0) {
            speed = Math.min(speed, topSpeed);
        }
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
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

    void fillTank(float gasolineTankCapacity) {
        gasolineLevel = Math.min(100, gasolineTankCapacity);
    }

    float getGasolineLevel() {
        return gasolineLevel;
    }
}
