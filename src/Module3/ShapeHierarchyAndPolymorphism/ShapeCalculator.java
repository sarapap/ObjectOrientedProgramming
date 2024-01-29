package Module3.ShapeHierarchyAndPolymorphism;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3, 4);
        shapes[2] = new Triangle(4, 7);

        System.out.println("\nShape Calculator \n");
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + area);
        }

    }
}
