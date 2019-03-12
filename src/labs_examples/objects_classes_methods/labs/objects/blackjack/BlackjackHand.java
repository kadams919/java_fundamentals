package labs_examples.objects_classes_methods.labs.objects.blackjack;

import java.util.ArrayList;

public class BlackjackHand {

    private ArrayList<Card> hand = new ArrayList();
//
//    public BlackjackHand() {
//    }

//    public BlackjackHand(Card card1, Card card2) {
//        hand.add(card1);
//        hand.add(card2);
//    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getHandValue() {
        return calculateHandValue();
    }

    public int calculateHandValue() {
        int score = 0;
        // anytime method is called, recalculate value of all cards in hand array list
        for(Card c : hand) {
            if(c.getValue() <= 9) {
                score += c.getValue();
            } else {
                score += 10;
            }
        }
        return score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(Card c : hand) {
            if(c.getValue() == 1) {
                sb.append("Ace");
            } else if(c.getValue() >= 2 && c.getValue() <= 9) {
                sb.append(c.getValue());
            } else if(c.getValue() == 10) {
                sb.append("Jack");
            } else if(c.getValue() == 11) {
                sb.append("Queen");
            } else {
                sb.append("King");
            }
            sb.append(c.getSuit());
            sb.append("\n");
        }
        return "BlackjackHand{" +
                "hand=" + sb.toString() +
                ", handValue=" + calculateHandValue() +
                '}';
    }
}
