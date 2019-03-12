package objects_classes_methods.labs.oop.C_blackjack.war;

import objects_classes_methods.labs.oop.C_blackjack.war.WarDeck;
import objects_classes_methods.labs.oop.C_blackjack.war.WarHand;

public class Player {

    private String name;

    private WarHand warHand;

    private int currentStackValue;

    public Player() {
        this.warHand = new WarHand();
    }

    public Player(String name, int currentStackValue) {
        this.warHand = new WarHand();
        this.name = name;
        this.currentStackValue = currentStackValue;
    }

    public String getName() {
        return name;
    }

    public WarHand getWarHand() {
        return warHand;
    }

    public static Player createNewPlayer(WarDeck warDeck) {
        Player player = new Player("Computer", 10);
        for(int i = 0; i < 26; i++) {
            warDeck.deal(player);
        }

        return player;
    }

    public static Player createNewPlayer(String name, WarDeck warDeck) {
        Player player = new Player(name, 10);
        for(int i = 0; i < 26; i++) {
            warDeck.deal(player);
        }

        return player;
    }
}
