package labs_examples.objects_classes_methods.labs.oop.D_my_oop.card_games.blackjack;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.card_games.card_games.Deck;

import java.util.ArrayList;
import java.util.Random;

public class BlackjackDeck extends Deck {

    ArrayList<Integer> used = new ArrayList();

    public void deal(Player player) {

        Random random = new Random();
        int n;
        boolean dealt = false;

        do {
            n = random.nextInt(52);
            if(!used.contains(n)) {
                player.getBlackjackHand().getHand().add(super.getDeck()[n]);
                used.add(n);
                dealt = true;
            }
        } while(!dealt);
    }

    public void shuffleDeck() {
        used = new ArrayList();
    }
}
