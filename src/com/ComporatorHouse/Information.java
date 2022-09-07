package com.ComporatorHouse;



import java.util.Set;
import java.util.TreeSet;


public class Information {
    public static void main(String[] args) {

        Set<House> myHouseListArray = new TreeSet<>();

        House firstHouse = new House(200,100,"Tashkent", false);
        House secondHouse = new House(150,90,"Tashkent", true);
        House thirdHouse = new House(400,300,"Kazakhstan", true);

        myHouseListArray.add(firstHouse);
        myHouseListArray.add(secondHouse);
        myHouseListArray.add(thirdHouse);

        for (House house : myHouseListArray) {
            System.out.println(house);
        }
        //System.out.println(myHouseListArray);
    }
}
