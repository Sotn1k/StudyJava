package Tasks.lesson8;

public class Solution {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        long before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            string.append(i).append(" ");
        }
        long after = System.currentTimeMillis();
        System.out.println(string);
        System.out.println("Время выполнения стрингбилдер: " + (after - before));


            String string1 = "";
        before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            string1 += i + " ";
        }
        after = System.currentTimeMillis();
        System.out.println(string1);
        System.out.println("Время выполнения стринг: " + (after - before));


        Airplane airplane = new Airplane("Boing", 2000,150,10000);
        System.out.println(airplane);

        double num = 17.82;
        for (int i = 1; i <= 30; i++) {
            num += 2;
            System.out.println(num + " " + i);
        }

    }



}
