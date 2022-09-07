package com.solution;

import java.util.Scanner;

public class Car {
    private int speedVol;
    private int maxVol;
    private String color;
    private String nameCar;
    static int counter;

    static {
        Scanner scanner = new Scanner(System.in);
        counter = scanner.nextInt();
    }

    private Car() {

        counter++;//счетчик создание машин работает через сканер
    }

    public Car(int speedVol, int maxVol, String color, String nameCar) {
        this.speedVol = speedVol;
        this.maxVol = maxVol;
        this.color = color;
        this.nameCar = nameCar;
        counter++;
    }

    public static Car getCar(){

        return new Car();
    }
    /*public static Car getCarFull(int speedVol, int maxVol, String color, String nameCar){
        return new Car();
    }*/

    public static int counter() {
        return 0;
    }

    public int getSpeedVol() {
        return speedVol;
    }

    public void setSpeedVol(int speedVol) {

        this.speedVol = speedVol;

    }

    public int getMaxVol() {
        return maxVol;
    }

    public void setMaxVol(int maxVol) {

        this.maxVol = maxVol;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getNameCar(String nissan) {
        return nameCar;
    }

    public void setNameCar(String nameCar) {

        this.nameCar = nameCar;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speedVol=" + speedVol +
                ", maxVol=" + maxVol +
                ", color='" + color + '\'' +
                ", nameCar='" + nameCar + '\'' +
                '}';
    }
}
