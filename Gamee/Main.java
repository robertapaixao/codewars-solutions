package Gamee;

public class Main {

    public static String winner(String[] deckSteve, String[] deckJosh) {

        String cards = "23456789TJQKA";

        int steve = 0;
        int josh = 0;

        for (int i = 0; i < deckSteve.length; i++) {

            int cardSteve = cards.indexOf(deckSteve[i]);
            int cardJosh = cards.indexOf(deckJosh[i]);

            if (cardSteve > cardJosh) {
                steve++;
            } else if (cardJosh > cardSteve) {
                josh++;
            }
        }

        if (steve > josh) {
            return "Steve wins " + steve + " to " + josh;
        } else if (josh > steve) {
            return "Josh wins " + josh + " to " + steve;
        } else {
            return "Tie";
        }
    }

    public static void main(String[] args) {

        String[] steve = {"A", "7", "8"};
        String[] josh = {"K", "5", "9"};

        System.out.println(winner(steve, josh));
    }
}