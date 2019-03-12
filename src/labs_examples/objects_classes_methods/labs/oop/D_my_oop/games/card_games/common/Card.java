package labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.common;

public class Card {

    private char[] suitArray = new char[]{'♠', '♦', '♥', '♣'};
    private char suit;
    private int value;

    public Card() {
    }

    /**
     *
     * @param suit
     * @param value
     */

    public Card(int suit, int value) {
        this.value = value;
        this.suit = suitArray[suit];
    }

    public char getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{suit=" + suit +
                ", value=" + value +
                '}';
    }
}
