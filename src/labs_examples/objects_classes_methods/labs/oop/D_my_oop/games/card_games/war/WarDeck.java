package labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.war;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.common.Deck;

import java.util.ArrayList;
import java.util.Random;

public class WarDeck extends Deck {

    private ArrayList<Integer> used = super.getUsed();

    public void deal(WarPlayer warPlayer) {

        Random random = new Random();
        int n;
        boolean dealt = false;

        do {
            n = random.nextInt(52);
            if(!used.contains(n)) {
                warPlayer.getWarHand().getHand().add(super.getDeck()[n]);
                used.add(n);
                dealt = true;
            }
        } while(!dealt);
    }

    public void shuffleDeck() {
        used = super.getUsed();
    }
}
