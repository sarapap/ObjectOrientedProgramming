package Module3.ShapeProperties;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
