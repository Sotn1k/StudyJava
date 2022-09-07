package com.InputOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class IODemo {
    public static final String DATA_DAT = "data.dat";
    public static final String DATA_TXT = "data.txt";


    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        try (

                DataOutputStream dataOutputStream = new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(DATA_DAT)))
        ) {
           for (int i = 0; i < 20; i++) {
                int value = ThreadLocalRandom.current().nextInt(10000);
                dataOutputStream.writeInt(value);
            }
            dataOutputStream.writeInt(89+(88<<8)+(87<<16)+(80<<24));

            //dataOutputStream.writeInt(12345);

        } catch (IOException e) {
            throw new AppEx(e);
        }
        List<Integer> list = new ArrayList<>();
        try (
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(DATA_DAT)));
        ){
            while (dataInputStream.available()>0){
                int value = dataInputStream.readInt();
                list.add(value);
            }


        } catch (IOException e) {
            throw new AppEx(e);
        }

        System.out.println(list);
        try (PrintWriter out = new PrintWriter(DATA_TXT))
        {

        double sum = 0;
            for (Integer value : list) {
                out.print(value + " ");
                sum += value;
            }
            out.println();
            out.print(list.size());
            out.printf("%naverage for list = %f%n", sum / list.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}


















