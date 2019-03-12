package labs_examples.objects_classes_methods.labs.objects.blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    Card[] deck = new Card[52];
    ArrayList<Integer> used = new ArrayList();

    public Deck() {
        populateDeck();
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

    public void deal(Player player) {

        Random random = new Random();
        int n;
        boolean dealt = false;

        do {
            n = random.nextInt(52);
            if(!used.contains(n)) {
                player.getBlackjackHand().getHand().add(deck[n]);
                used.add(n);
                dealt = true;
            }
        } while(!dealt);
    }

    public void shuffleDeck() {
        used = new ArrayList();
    }
}
