package objects_classes_methods.labs.objects;

public class Hand {

    Card card = new Card(new char[]{'♠', '♦', '♥', '♣'});

    public Hand() {

    }

    public Hand(Card card) {
        this.card = card;
    }

}
