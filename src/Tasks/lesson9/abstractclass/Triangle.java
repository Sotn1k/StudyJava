package Tasks.lesson9.abstractclass;

public class Triangle extends Figure {
    int a = 0;
    int b = 0;
    int c = 0;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        int area = 0;
        int s = (a + b + c) / 2;
        area = (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
