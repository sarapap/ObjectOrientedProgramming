package Module2.CreateCoffeeMaker;

public class Coffee {
    private boolean isOn;
    private String coffeeType;
    private int amount;

    public Coffee() {
        isOn = false;
        coffeeType = "";
        amount = 10;
    }

    public void pressOnOff() {
        isOn = !isOn;
        if (!isOn) {
            System.out.println("The coffee maker is off.");
        } else {
            System.out.println("The coffee maker is on");
        }
    }

    public void setCoffeeType(String type) {
        if (isOn) {
            coffeeType = type;
            System.out.println("The coffee type is: " + coffeeType);
        } else {
            System.out.println("You need to turn on the coffee maker. ");
        }
    }

    public void setAmount(int coffeeAmount) {
        if (isOn) {
            if (amount >= 10 && amount <= 80) {
                amount = coffeeAmount;
                System.out.println("Selected coffee amount: " + amount + " ml.");
            }
        } else {
            System.out.println("You need to turn on the coffee maker. ");
        }
    }

    public boolean isOn() {
        return false;
    }
}
