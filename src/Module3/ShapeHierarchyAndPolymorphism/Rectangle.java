package Module3.ShapeHierarchyAndPolymorphism;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
         this.length = length;
         this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}
