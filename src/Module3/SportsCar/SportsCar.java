package Module3.SportsCar;


public class SportsCar extends Car {
    private void setSpeed(float v) {
    }

    public SportsCar(String typeName) {
        super(typeName);
    }

    public void accelerate() {
        if (getGasolineLevel() > 0)
            setSpeed(getSpeed() + 20);
        else
            setSpeed(0);
    }

    void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            if (amount > 0)
                setSpeed(Math.max(0, getSpeed()- amount * 2));
        } else
            setSpeed(0);
    }}
