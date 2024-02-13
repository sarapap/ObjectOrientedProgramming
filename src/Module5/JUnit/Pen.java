package Module5.JUnit;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) {
            this.color = color;
        }
        @Override public String toString() {
            return color;
        }
    }
    private Color currentColor;
    private boolean capOn;

    public Pen() {
        this(Color.RED);
    }

    public Pen(Color color) {
        this.currentColor = color;
        this.capOn = true;
    }

    // your code here
    public String draw() {
        if (!capOn) {
            return "Drawing " + currentColor;
        } else {
            return "";
        }
    }

    public void capOff() {
        this.capOn = false;
    }

    public void capOn() {
        this.capOn = true;
    }

    public void changeColor(Color newColor) {
        if (capOn) {
            this.currentColor = newColor;
        }
    }

    public static void main(String[] args) {
        Pen p = new Pen();
        System.out.println("Drawing:" + p.draw());
        p.capOff();
        System.out.println("Drawing: " + p.draw());
        p.capOn();
        System.out.println("Drawing: " + p.draw());

        Pen p2 = new Pen(Pen.Color.BLUE);
        System.out.println("Drawing: " + p2.draw());
        p2.capOff();
        System.out.println("Drawing: " + p2.draw());
        p2.capOn();
        System.out.println("Drawing: " + p2.draw());
       
        p.capOff();
        System.out.println("Drawing: " + p.draw());
        p.changeColor(Pen.Color.GREEN);
        System.out.println("Drawing: " + p.draw());

        p.capOn();
        p.changeColor(Pen.Color.GREEN);
        System.out.println("Drawing: " + p.draw());
        p.capOff();
        System.out.println("Drawing: " + p.draw());
    }
}
