package Tasks.dice;

import java.util.Random;

public class Dice {


    public void diceRandom(Player player){
        Random random = new Random();
        int numDice = random.nextInt(7);
        String nameValue = switch (numDice) {
            case 1 -> "Один";
            case 2 -> "Два";
            case 3 -> "Три";
            case 4 -> "Четыре";
            case 5 -> "Пять";
            case 6 -> "Шесть";
            default -> "";
        };

        System.out.printf("Игрок под именем %s выпали кости %s %d \n", player.getNamePlayer(), nameValue,numDice);

    }
}
