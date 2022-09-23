package Tasks.lesson10;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println("Информация " + warehouse + " " + picker + " " + courier);

        picker.doWork();
        courier.doWork();
        System.out.println("Информация " + warehouse + " " + picker + " " + courier);

    }
}
