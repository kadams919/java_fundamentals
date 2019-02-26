package objects_classes_methods.labs.objects;

public class Player {

    String name;

    Card card = new Card(new char[]{'♠', '♦', '♥', '♣'});

    Hand hand = new Hand(card);

    public Player() {

    }

    public Player(String name) {
        this.name = name;
    }

}
