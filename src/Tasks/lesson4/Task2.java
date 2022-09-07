package Tasks.lesson4;


public class Task2 {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 10000) + 1;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int zeroValue = 0;
        int sumZero = 0;
        for (int array : arrays) {
            System.out.print(array + " ");
            if (array > max) {
                max = array;
            }
            if (array < min) {
                min = array;
            }
            if (array % 10 == 0) {
                zeroValue++;
                sumZero += array;
            }
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
        System.out.println(zeroValue);
        System.out.println(sumZero);
    }
}
