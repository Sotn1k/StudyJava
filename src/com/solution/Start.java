package com.solution;

public class Start {



    public static void main(String[] args) {
        Car car1 = Car.getCar();
        car1.setNameCar("Nissan");
        car1.setSpeedVol(200);
        car1.setColor("Green");
        car1.setMaxVol(350);

        Car car3 = Car.getCar();
        car3.setNameCar("Lada");
        car3.setSpeedVol(100);
        car3.setColor("Red");
        car3.setMaxVol(150);

        Car car2 = new Car(200, 150, "Yellow", "BMW");

        Car[] cars = {car1,car2,car3,};
        for (Car car : cars){
            System.out.println(car);
        }
        /*System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);*/
        System.out.println(Car.getCounter());

        //System.out.println(car3.getColor());

    }


}
