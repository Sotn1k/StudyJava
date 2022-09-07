package Tasks.dice;

public class Solution {
    public static void main(String[] args) {
        Player player = new Player("Альберт");
        Dice dice = new Dice();
        Player player1 = new Player("Фатима");
        dice.diceRandom(player);
        dice.diceRandom(player1);
    }
}
