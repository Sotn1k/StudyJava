package com.setCollectionDemo;



import java.util.*;


public class SetDemo {

    public static void main(String[] args) {
        //List<String> arrayString = new LinkedList<>();

        StringTokenizer tokenizer =  new StringTokenizer(Data.TEXT, "*1@O2<>34\"56+79–80/.,: (){}%[]!&?;=-\n");// из текста выдернули символы!
        Collection<String> list = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {// после чистки токенайзера завели слова в Arraylist
            String word = tokenizer.nextToken();
            list.add(word);
        }
        boolean condition = list.removeIf(word -> word.startsWith("F"));// Удаляем значения с листа Arraylist которые начинаются на нужную на букву для удаления
        boolean condition1 = list.removeIf(word -> word.startsWith("T"));
        boolean condition2 = list.removeIf(word -> word.startsWith("Т"));
        if (condition){// выводим информацию об успешном удаление !
            System.out.println("Deleted F");
        }if (condition2){
            System.out.println("Deleted T");
        }if (condition1)
            System.out.println("Deleted T");
        System.out.println();

        System.out.println(list);
        Set<String> uniqueWord = new TreeSet<>(list); // из списка листа выводим уникальные слова! treeset
        //uniqueWord.addAll(list);
        System.out.printf("List size = %d Set size = %d%n", list.size(), uniqueWord.size());// выводим информацию об очистке удаления слов и оставшийся уникальные слова
        System.out.println("List size = " + list.size() + " Set size = " +  uniqueWord.size() );

        System.out.println("---------");
        System.out.println(uniqueWord);
        System.out.printf("List size = %d Set size = %d%n", list.size(), uniqueWord.size());

        Deque<String> reversedOrderWords = new ArrayDeque<>();// очередь из списка первым завели певым выходит
        for (String words : uniqueWord) {
            reversedOrderWords.addFirst(words);// делаем реверс слов
        }
        System.out.println("---------");
        System.out.println("\n\n"+reversedOrderWords);
    }



}

























