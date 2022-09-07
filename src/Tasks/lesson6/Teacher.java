package Tasks.lesson6;

import java.util.Random;

public class Teacher  {
    String name;
    String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }



    public void evaluation(Students students){
        Random random = new Random();
        int num = random.nextInt(2,5);
        String evalution = switch (num) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "ОТлично";
            default -> "";
        };
        System.out.println("Преподаватель " + this.name +" оценил студента с именем " + students.nameStudents + " по предмету " + this.object + " на оценку " + evalution);

    }


}
