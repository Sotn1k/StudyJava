package Tasks.lesson9.abstractclass;

public class Solution {
    public static void main(String[] args) {
        Figure [] figures = {
                new Triangle("Green", 10,10,10),
                new Triangle("Blue",10,20,30),
                new Triangle("Green",10,20,15),
                new Rectangle("Red",5,10),
                new Rectangle("Green",15,40),
                new Rectangle("Yellow",20,15),
                new Circle("Red",10),
                new Circle("Green", 25),
                new Circle("Blue", 5)
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));

    }
    public static double calculateRedPerimeter(Figure[] figures){
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.perimeter();
        }
        return sum;
    }

    public static double calculateRedArea(Figure[] figures){
        double sum = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red"))
                sum += figure.area();
        }
        return sum;
    }
}



































