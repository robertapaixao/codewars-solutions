package Gamee;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        String[] steve = {"A", "7", "8"};
        String[] josh = {"K", "5", "9"};

        System.out.println(game.winner(steve, josh));
    }
}