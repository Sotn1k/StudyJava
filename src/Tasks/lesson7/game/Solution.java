package Tasks.lesson7.game;

public class Solution {
    public static void main(String[] args) {
        Player player1 = new Player(95);
        Player player2 = new Player(91);
        Player player3 = new Player(98);

        Player.info();

        Player player4 = new Player(90);
        Player player5 = new Player(96);
        Player player6 = new Player(95);
        Player.info();

        Player.info();


        for (int i = 0; i < 95; i++) {
            player1.run();
        }
        Player.info();

        Player player = new Player(100);
        Player.info();
    }
}
