package Tasks.lesson5;

import java.util.Scanner;

public class Airplane {
    String producer;
    int year;
    double length;
    double weight;
    double fuel = 0;


    public Airplane() {
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }



    public void fillUp() {
        System.out.println("Введите сколько топлива залить");
        Scanner sc = new Scanner(System.in);
        double fill = fuel + sc.nextInt();
        System.out.println("Зарпален на " + fill);
        fuel=fill;
    }
    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %.2f, вес: %.2f, количество топлива в баке: %.2f\n", producer, year, length, weight, fuel);
    }


}
