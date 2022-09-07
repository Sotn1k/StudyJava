package Tasks.lesson5;

import java.util.Scanner;

public class Car {
    private int yearToCar;
    private String color;
    private String model;

    public Car(int yearToCar, String color, String model) {
        this.yearToCar = yearToCar;
        this.color = color;
        this.model = model;
    }

    public Car() {
    }

    public int getYearToCar() {
        return yearToCar;
    }

    public void setYearToCar(int yearToCar) {
        this.yearToCar = yearToCar;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car" +
                "yearToCar=" + yearToCar +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' ;
    }

    public void info(){
        System.out.println("Это Машина "+ model);
    }

    public void yearDifference (){
        System.out.println("Введите год");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int num = year - yearToCar;
        System.out.printf("Разница в %d \n", num);
    }
}
