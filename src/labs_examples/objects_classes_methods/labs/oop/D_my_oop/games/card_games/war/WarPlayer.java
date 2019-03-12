package labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.war;

public class WarPlayer {

    private String name;

    private WarHand warHand;

//    public WarPlayer() {
//        this.warHand = new WarHand();
//    }
//
//    public WarPlayer(String name) {
//        this.warHand = new WarHand();
//        this.name = name;
//    }


    public String getName() {
        return name;
    }

    public WarHand getWarHand() {
        return warHand;
    }

    public WarPlayer(String name, WarDeck warDeck) {
        this.name = name;
        this.warHand = new WarHand();
        for(int i = 0; i < 26; i++) {
            warDeck.deal(this);
        }

    }
}
