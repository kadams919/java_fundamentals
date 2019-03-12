package labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.blackjack;

public class BlackjackPlayer {

    private String name;

    private BlackjackHand blackjackHand;

    private int currentStackValue;

    public BlackjackPlayer() {
        this.blackjackHand = new BlackjackHand();
    }

    public BlackjackPlayer(String name, int currentStackValue) {
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

    public static BlackjackPlayer createNewPlayer(BlackjackDeck blackjackDeck) {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer("Computer", 10);
        blackjackDeck.deal(blackjackPlayer);
        blackjackDeck.deal(blackjackPlayer);

        return blackjackPlayer;
    }

    public static BlackjackPlayer createNewPlayer(String name, BlackjackDeck blackjackDeck) {
        BlackjackPlayer blackjackPlayer = new BlackjackPlayer(name, 10);
        blackjackDeck.deal(blackjackPlayer);
        blackjackDeck.deal(blackjackPlayer);

        return blackjackPlayer;
    }
}
