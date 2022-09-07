package Tasks.lesson7;

public class Solution {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 1990, 70.5,40.5);
        Airplane airplane2 = new Airplane();
        airplane2.producer = "s7";
        airplane2.year = 2000;
        airplane2.length = 50.9;
        airplane2.weight= 60.1;

        airplane1.fillUp();
        airplane2.fillUp();

        airplane1.info();
        airplane2.info();

        Airplane.compareAirplanes(airplane1,airplane2);

    }
}
