package Tasks.lesson5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearToCar(2000);
        car1.setColor("Yellow");
        car1.setModel("Nissan");

        Car car2 = new Car(2002, "Green", "BMW");

        System.out.printf("Машина № 1 модель %s цвет %s год выпуска %d \n", car1.getModel(), car1.getColor(), car1.getYearToCar());
        System.out.println(car2);

        Motorbike bike1 = new Motorbike(2020, "Black", "Honda");
        System.out.printf("Мотоцикл № 1 модель %s цвет %s год выпуска байка %d\n", bike1.getModelBike(), bike1.getColorBike(), bike1.getYearToBike());
        bike1.yearDifference();
        bike1.info();

        car1.yearDifference();
        car1.info();


        Airplane airplane = new Airplane("AirBus", 1990, 20.5, 80.9);

        airplane.fillUp();
        airplane.info();

        Airplane airplane1 = new Airplane();
        airplane1.setProducer("Boing");
        airplane1.setLength(25);
        airplane1.setWeight(70.5);
        airplane1.setYear(1995);

        airplane1.fillUp();
        airplane1.info();
    }

}
