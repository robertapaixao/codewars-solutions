package Gamee;

public class Game {

    public String winner(String[] deckSteve, String[] deckJosh) {

        String cards = "23456789TJQKA";

        int steve = 0;
        int josh = 0;

        for (int i = 0; i < deckSteve.length; i++) {

            char cardSteve = deckSteve[i].charAt(0);
            char cardJosh = deckJosh[i].charAt(0);

            int valueSteve = cards.indexOf(cardSteve);
            int valueJosh = cards.indexOf(cardJosh);

            if (valueSteve > valueJosh) {
                steve++;
            } else if (valueJosh > valueSteve) {
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
}