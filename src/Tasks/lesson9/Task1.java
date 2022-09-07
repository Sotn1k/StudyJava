package Tasks.lesson9;

public class Task1 {
    public static void main(String[] args) {
        Students student1 = new Students("Albert", "Math Group");
        Teacher teacher1 = new Teacher("Olga Petrovna", "Mathematics");

        System.out.println(student1.getNameGroup());
        System.out.println(teacher1.getObject());

        student1.printInfo();
        teacher1.printInfo();


    }
}
