package Tasks.lesson1;

public class Task3 {
    public static void main(String[] args) {
        int year = 1980;
        int num = 0;
       /* while (num < 10){
            System.out.printf("Олимпиада %d года%n", year);
            year += 4;
            num ++;

        }*/
        /*for (int i = 0; i < 11; i++) {
            System.out.println("Олипиада " + year + " года");
            year += 4;
        }*/

        for (int i = year; i <= 2020; i+=4) {
            System.out.println("Олипиада " + i + " года");

        }
    }
}
