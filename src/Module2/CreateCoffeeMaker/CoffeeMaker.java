package Module2.CreateCoffeeMaker;

public class CoffeeMaker {
    public static void main(String[] args) {
        Coffee coffeeMaker = new Coffee();

        if (!coffeeMaker.isOn())
            coffeeMaker.pressOnOff();

        coffeeMaker.setCoffeeType("strong");
        coffeeMaker.setAmount(50);

        coffeeMaker.setCoffeeType("espresso");
        coffeeMaker.setAmount(70);

    }
}
