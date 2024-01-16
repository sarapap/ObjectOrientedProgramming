package Module1;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Cat Cat = new Cat("Whiskers");
        Cat Cat_2 = new Cat("Rex");

        // Call the meow method on the cat instance
        Cat.meow();
        Cat.meow();
        Cat_2.meow();
        Cat.meow();
    }
}