package Module3.Bus;

public class Bus extends Car {
    private int passengers;

    public Bus(String typeName) {
        super(typeName);
        passengers = 0;
    }

    public int getPassengers() {
        return passengers;
    }

    public void passengerEnter(int numPassengers) {
        if (numPassengers > 0) {
            passengers += numPassengers;
            System.out.println(numPassengers + " passengers entered the bus.");
        }

    }

    public void passengerExit(int numPassengers) {
        passengers = Math.max(0, passengers - numPassengers);
        System.out.println(numPassengers + " passengers exited the bus.");

    }
}
