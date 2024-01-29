package Module3.ShapeProperties;

public class Shape {
    private double area;
    private String color;

    public Shape(String color) {
        this.color = color;
        area = 0;
    }

    public double calculateArea() {
        return area;
    }

    public String getColor() {
        return color;
    }

}

