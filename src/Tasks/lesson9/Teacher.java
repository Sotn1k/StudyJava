package Tasks.lesson9;

public class Teacher extends Human {
    private String object;


    public Teacher(String name, String object) {
        super(name);
        this.object = object;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public void printInfo(){
        System.out.println("Этот человек с именем " + super.getName());
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
}
