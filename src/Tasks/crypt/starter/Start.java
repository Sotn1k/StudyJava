package Tasks.crypt.starter;

import Tasks.crypt.decrypt.DecryptText;
import Tasks.crypt.encrypt.EncryptText;

import java.util.Scanner;

public class Start {
    private static final EncryptText textToCrypt = new EncryptText();
    private static final DecryptText textToDeCrypt = new DecryptText();
    public static void main(String[] args) {
        int number = 1;
        while (number != 0) {

            System.out.println("""
                    Выбор оперций :\s
                    1 Зашифровать текста
                    2 Дешифрования текста
                    3 Выбор файла для шифрования
                    4 Сохранение результата шифрования
                    5 Расшифровать файл
                    6 Сохранить результат расшифрования
                    0 Выход из программы
                    """);

            Scanner switchNumber = new Scanner(System.in);
            int option = switchNumber.nextInt();

            switch (option){
                case 1:
                    System.out.println("Введите цифру ключа для шифрования!");
                    Scanner sc1 = new Scanner(System.in);
                    textToCrypt.setKeyCrypt(Integer.parseInt(sc1.nextLine())); //-->> не ставится ключ

                    System.out.println("Текст для криптования");
                    String textTo = sc1.nextLine();
                    System.out.println("Ваш текст для криптования: " + textTo);
                    String textToAfterCrypt = textToCrypt.encrypt(textTo);
                    System.out.println("Текст после криптования " + textToAfterCrypt);
                    break;
                case 2 :
                    System.out.println("Введите цифру ключа для дешифрования текста");
                    Scanner sc2 = new Scanner(System.in);
                    textToDeCrypt.setKeyDeCrypt(Integer.parseInt(sc2.nextLine()));

                    System.out.println("Текст для дешифрования");
                    String textDeCrypt = sc2.nextLine();
                    System.out.println("Ваш текст для дешифрования: " + textDeCrypt);
                    String textToAfterDeCrypt = textToDeCrypt.decrypt(textDeCrypt);
                    System.out.println("Текст после дешифрования " + textToAfterDeCrypt);
                    break;
                case 0 :
                    number = 0;
                    break;
            }
        }
    }
}