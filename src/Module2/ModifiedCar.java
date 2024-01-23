package Module2;


public class ModifiedCar {
    private float speed;
    private float gasolineLevel;
    private String typeName;

    public ModifiedCar(String typeName) {
        this.typeName = typeName;
        speed = 0;
        gasolineLevel = 0;
    }

    public ModifiedCar(String typename, float gasolineLevel, float topspeed) {
        this.typeName = typeName;
        this.gasolineLevel = Math.min(100, gasolineLevel);
        this.speed = 0;
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

    float getGasolineLevel() {
        return gasolineLevel;
    }
}
