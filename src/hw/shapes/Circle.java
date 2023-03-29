package hw.shapes;

public class Circle implements Shape{

    private Point point;

    private int radius;

    private String name = "Circle";

    public Circle(Point point, int radius) {
        this.point = point;
        radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "point=" + point +
                ", radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
