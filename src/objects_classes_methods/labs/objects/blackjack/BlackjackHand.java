package objects_classes_methods.labs.objects.blackjack;

import java.util.ArrayList;

public class BlackjackHand {

    private ArrayList<Card> hand = new ArrayList();

    public BlackjackHand(Card card1, Card card2) {
        hand.add(card1);
        hand.add(card2);
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getHandValue() {
        return calculateHandValue();
    }

    public int calculateHandValue() {
        // anytime method is called, recalculate value of all cards in hand array list
        for(Card c : hand) {
            System.out.println("calculating hand value for card " + c);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "BlackjackHand{" +
                "hand=" + hand +
                ", handValue=" + calculateHandValue() +
                '}';
    }
}
