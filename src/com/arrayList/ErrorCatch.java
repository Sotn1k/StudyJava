package com.arrayList;



public class ErrorCatch {



    static public void main(String[] args) {
        try {// изменение ошибки ловит по наименованию ошибки!
             int[] array = new int[5];
            array[4] = 1;
        }
        catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("выход за границу");
        }






    }


}