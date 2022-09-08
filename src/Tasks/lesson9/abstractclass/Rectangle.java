package Tasks.lesson9.abstractclass;

public class Rectangle extends Figure {
    int width = 0;
    int height = 0;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }
}
