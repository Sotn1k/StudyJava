package Tasks.lesson6;

public class Task {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Татьяна Иванова","Математика");
        Students students = new Students("Фатим");
        teacher.evaluation(students);
    }
}
