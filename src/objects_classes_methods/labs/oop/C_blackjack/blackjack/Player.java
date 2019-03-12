package objects_classes_methods.labs.oop.C_blackjack.blackjack;

import objects_classes_methods.labs.oop.C_blackjack.card_games.Card;

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

    public static Player createNewPlayer(BlackjackDeck blackjackDeck) {
        Player player = new Player("Computer", 10);
        blackjackDeck.deal(player);
        blackjackDeck.deal(player);

        return player;
    }

    public static Player createNewPlayer(String name, BlackjackDeck blackjackDeck) {
        Player player = new Player(name, 10);
        blackjackDeck.deal(player);
        blackjackDeck.deal(player);

        return player;
    }
}
