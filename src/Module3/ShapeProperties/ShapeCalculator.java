package Module3.ShapeProperties;


public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(3, "Red");
        shapes[1] = new Rectangle(3, 4, "Blue");
        shapes[2] = new Triangle(4, 7, "Yellow");

        System.out.println("\nShape Calculator \n");
        for (Shape shape : shapes) {
            double area = shape.calculateArea();
            String color = shape.getColor();
            System.out.println("Area of "  + color + " " + shape.getClass().getSimpleName() + ": " + area);
        }

    }
}
