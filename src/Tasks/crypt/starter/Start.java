package Tasks.crypt.starter;

import Tasks.crypt.decrypt.DecryptText;
import Tasks.crypt.encrypt.EncryptText;

import java.io.*;
import java.util.Scanner;

public class Start {
    private static final EncryptText textToCrypt = new EncryptText();
    private static final DecryptText textToDeCrypt = new DecryptText();

    public static void main(String[] args) {
        int number = 1;
        while (number != 0) {
            System.out.println();
            System.out.println("""
                    Выбор оперций :\s
                    1 Зашифровать текста
                    2 Дешифрования текста
                    3 Зашифровать текст из файла & Сохранение результата шифрования в отдельный файл
                    5 Расшифровать файл & Сохранить результат расшифрованияв отдельный файл
                                        
                    0 Выход из программы
                    """);

            Scanner switchNumber = new Scanner(System.in);
            int option = switchNumber.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Введите цифру ключа для шифрования!");
                    Scanner sc1 = new Scanner(System.in);
                    textToCrypt.setKeyCrypt(Integer.parseInt(sc1.nextLine())); //-->> не ставится ключ

                    System.out.println("Текст для криптования");
                    String textTo = sc1.nextLine();
                    System.out.println("Ваш текст для криптования: " + textTo);
                    String textToAfterCrypt = textToCrypt.encrypt(textTo);
                    System.out.println("Текст после криптования: " + textToAfterCrypt);
                    break;
                case 2:
                    System.out.println("Введите цифру ключа для дешифрования текста");
                    Scanner sc2 = new Scanner(System.in);
                    textToDeCrypt.setKeyDeCrypt(Integer.parseInt(sc2.nextLine()));

                    System.out.println("Текст для дешифрования:  ");
                    String textDeCrypt = sc2.nextLine();
                    System.out.println("Ваш текст для дешифрования: " + textDeCrypt);
                    String textToAfterDeCrypt = textToDeCrypt.decrypt(textDeCrypt);
                    System.out.println("Текст после дешифрования " + textToAfterDeCrypt);
                    break;
                case 3:
                    try {
                        FileInputStream fis = new FileInputStream("textNotCrypt.txt");
                        FileOutputStream fos = new FileOutputStream("textToCrypt.txt");
                        Reader reader = new InputStreamReader(fis);
                        System.out.println("Введите цифру ключа для шифрования!");
                        Scanner sc3 = new Scanner(System.in);
                        textToCrypt.setKeyCrypt(Integer.parseInt(sc3.nextLine()));
                        while (reader.ready()) {
                            char crypt = (char) reader.read();
                            String textToAfterCryptFile = textToCrypt.encrypt(String.valueOf(crypt));
                            System.out.print(textToAfterCryptFile);

                            // TODO реализовать сохранения в файл!
                        }
                        fis.close();
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        FileInputStream fis = new FileInputStream("textToCrypt.txt");
                        FileOutputStream fos = new FileOutputStream("textNotCrypt1.txt");
                        Reader reader = new InputStreamReader(fis);
                        System.out.println("Введите цифру ключа для дешифрования текста!");
                        Scanner sc4 = new Scanner(System.in);
                        textToCrypt.setKeyCrypt(Integer.parseInt(sc4.nextLine()));
                        while (reader.ready()) {
                            char crypt = (char) reader.read();
                            String textToAfterCryptFile = textToDeCrypt.decrypt(String.valueOf(crypt));
                            System.out.print(textToAfterCryptFile);
                            // TODO реализовать сохранения в файл!
                        }
                        fis.close();
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 0:
                    number = 0;
                    break;
            }
        }
    }
}