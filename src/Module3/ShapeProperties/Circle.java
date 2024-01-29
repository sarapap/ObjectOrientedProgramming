package Module3.ShapeProperties;


public class Circle extends Shape {
    private double r;

    public Circle(double r, String color) {
        super(color);
        this.r = r;
    }

    public double calculateArea() {
        return Math.PI * r * r;
    }
}
