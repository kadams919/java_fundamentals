package objects_classes_methods.labs.oop.C_blackjack.war;

import objects_classes_methods.labs.oop.C_blackjack.card_games.Deck;

import java.util.ArrayList;
import java.util.Random;

public class WarDeck extends Deck {

    private ArrayList<Integer> used = super.getUsed();

    public void deal(Player player) {

        Random random = new Random();
        int n;
        boolean dealt = false;

        do {
            n = random.nextInt(52);
            if(!used.contains(n)) {
                player.getWarHand().getHand().add(super.getDeck()[n]);
                used.add(n);
                dealt = true;
            }
        } while(!dealt);
    }

    public void shuffleDeck() {
        used = super.getUsed();
    }
}
