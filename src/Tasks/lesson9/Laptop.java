package Tasks.lesson9;

public class Laptop extends Computer{
    private int batteryCapacity;

    public Laptop(String manufacturer, int year, int batteryCapacity) {
        super(manufacturer, year);
        this.batteryCapacity = batteryCapacity;
    }
}
