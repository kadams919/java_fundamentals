package objects_classes_methods.labs.objects.blackjack;

import objects_classes_methods.labs.objects.blackjack.BlackjackHand;
import objects_classes_methods.labs.objects.blackjack.Card;

public class Player {

    private String name;

    private BlackjackHand blackjackHand;

    private int currentStackValue;

    public Player() {

    }

    public Player(String name, int currentStackValue) {
        this.name = name;
        this.currentStackValue = currentStackValue;
    }

    public String getName() {
        return name;
    }

    public BlackjackHand getBlackjackHand() {
        return blackjackHand;
    }

    public void addCardToHand(Card card) {
        this.blackjackHand.getHand().add(card);
    }
}
