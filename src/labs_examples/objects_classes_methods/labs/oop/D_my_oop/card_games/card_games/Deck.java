package labs_examples.objects_classes_methods.labs.oop.D_my_oop.card_games.card_games;

import java.util.ArrayList;

public class Deck {

    private Card[] deck = new Card[52];
    private ArrayList<Integer> used = new ArrayList();

    public Deck() {
        populateDeck();
    }

    public Card[] getDeck() {
        return deck;
    }

    public ArrayList<Integer> getUsed() {
        return used;
    }

    private void populateDeck() {
        int count = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                Card card = new Card(i, j);
                deck[count] = card;
                count++;
            }
        }
    }
}
