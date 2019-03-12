package labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.war;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.common.Hand;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.blackjack.BlackjackPlayer;
import labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.common.Card;

public class WarHand extends Hand {

    public String toString(BlackjackPlayer blackjackPlayer) {
        if(blackjackPlayer.getName().equalsIgnoreCase("computer")) {
            return "\nThe computer's hand value is: "; //+ calculateHandValue();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Your current hand is: ");

            for (Card c : hand) {
                sb.append("\n");
                if (c.getValue() == 1) {
                    sb.append("Ace of ");
                } else if (c.getValue() >= 2 && c.getValue() <= 9) {
                    sb.append(c.getValue() + " of ");
                } else if (c.getValue() == 10) {
                    sb.append("Jack of ");
                } else if (c.getValue() == 11) {
                    sb.append("Queen of ");
                } else if (c.getValue() == 12){
                    sb.append("King of ");
                }
                sb.append(c.getSuit());
            }
            return sb.toString() +
                    "\nYour hand value is: "; //+ calculateHandValue();
        }
    }
}
