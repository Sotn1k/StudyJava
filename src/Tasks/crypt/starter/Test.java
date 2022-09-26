package Tasks.crypt.starter;

import Tasks.crypt.encrypt.EncryptText;

import java.io.*;
import java.util.Scanner;


public class Test {
    private static final EncryptText textToCrypt = new EncryptText();
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("data.txt");
            FileOutputStream fos = new FileOutputStream("crypt.txt");
            Reader reader = new InputStreamReader(fis);
            System.out.println("Введите цифру ключа для шифрования!");
            Scanner sc3 = new Scanner(System.in);
            textToCrypt.setKeyCrypt(Integer.parseInt(sc3.nextLine()));
            while (reader.ready()){
                char crypt = (char) reader.read();
                String textToAfterCrypt = textToCrypt.encrypt(String.valueOf(crypt));
                System.out.print(textToAfterCrypt);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}





















