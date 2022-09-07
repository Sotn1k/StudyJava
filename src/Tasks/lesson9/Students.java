package Tasks.lesson9;

public class Students extends Human {
    private String nameGroup;

    public Students(String name, String nameGroup) {
        super(name);
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void printInfo(){
        System.out.println("Этот человек с именем " + super.getName());
        System.out.println("Этот студент с именем " + super.getName());
    }

}
