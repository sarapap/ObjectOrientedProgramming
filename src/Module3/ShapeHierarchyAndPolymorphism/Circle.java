package Module3.ShapeHierarchyAndPolymorphism;

public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculateArea() {
        return Math.PI * r * r;
    }
}
