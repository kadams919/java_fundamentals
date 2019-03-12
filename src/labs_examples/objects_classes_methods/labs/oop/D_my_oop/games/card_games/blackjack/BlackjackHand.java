package labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.blackjack;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.common.Card;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.common.Hand;

public class BlackjackHand extends Hand {

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

    public String toString(BlackjackPlayer blackjackPlayer) {
        if(blackjackPlayer.getName().equalsIgnoreCase("computer")) {
            return "\nThe computer's hand value is: " + calculateHandValue();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Your current hand is: ");

            for (Card c : hand) {
                sb.append("\n");
                if (c.getValue() == 1) {
                    sb.append("Ace of ");
                } else if (c.getValue() >= 2 && c.getValue() <= 10) {

                    sb.append(c.getValue() + " of ");
                } else if (c.getValue() == 11) {
                    sb.append("Jack of ");
                } else if (c.getValue() == 12) {
                    sb.append("Queen of ");
                } else if (c.getValue() == 13){
                    sb.append("King of ");
                }
                sb.append(c.getSuit());
            }
            return sb.toString() +
                    "\nYour hand value is: " + calculateHandValue();
        }
    }
}
