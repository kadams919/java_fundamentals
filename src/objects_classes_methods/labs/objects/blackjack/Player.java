package objects_classes_methods.labs.objects.blackjack;

import objects_classes_methods.labs.objects.blackjack.BlackjackHand;
import objects_classes_methods.labs.objects.blackjack.Card;

public class Player {

    private String name;

    private BlackjackHand blackjackHand;

    private int currentStackValue;

    public Player() {
        this.blackjackHand = new BlackjackHand();

    }

    public Player(String name, int currentStackValue) {
        this.blackjackHand = new BlackjackHand();
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

    public static Player createNewPlayer(String name, Deck deck) {
        Player player = new Player(name, 10);
        deck.deal(player);
        deck.deal(player);

        return player;
    }
}
