package Tasks.lesson5;

import java.util.Scanner;

public class Motorbike {
    private int yearToBike;
    private String colorBike;
    private String modelBike;

    public Motorbike(int yearToBike, String colorBike, String modelBike) {
        this.yearToBike = yearToBike;
        this.colorBike = colorBike;
        this.modelBike = modelBike;
    }

    public int getYearToBike() {
        return yearToBike;
    }

    public String getColorBike() {
        return colorBike;
    }

    public String getModelBike() {
        return modelBike;
    }

    public void info(){
        System.out.println("Это мотоцикл "+ modelBike);
    }

    public void yearDifference (){
        System.out.println("Введите год");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int num = year - yearToBike;
        System.out.printf("Разница в %d \n", num);
    }

}
