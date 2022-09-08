package Tasks.lesson9.abstractclass;

public class Circle extends Figure {
    int radius = 0;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }
}
