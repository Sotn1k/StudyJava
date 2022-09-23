package Tasks.lesson10;

public class CountWords {
    public static void main(String[] args) {

        String text = "Albert is a bad coder,2313213  asdd dsdsd";
        char[] textToChar = text.toCharArray();
        int count = 0;
        boolean wordBegin = true;

        for (char word : textToChar) {
            if (isLatinChar(word)) {
                if (wordBegin) {
                    wordBegin = false;
                    count++;
                }
            } else {
                wordBegin = true;
            }
        }
        System.out.println("Word count: " + count);
}
        private static boolean isLatinChar(char c) {
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}
