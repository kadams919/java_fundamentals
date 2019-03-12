package objects_classes_methods.labs.oop.C_blackjack.war;

import objects_classes_methods.labs.oop.C_blackjack.blackjack.Player;
import objects_classes_methods.labs.oop.C_blackjack.card_games.Card;

import java.util.ArrayList;

public class WarHand {

    private ArrayList<Card> hand = new ArrayList();

    public ArrayList<Card> getHand() {
        return hand;
    }

//    public int getHandValue() {
//        return calculateHandValue();
//    }
//
//    public int calculateHandValue() {
//        int score = 0;
//        // anytime method is called, recalculate value of all cards in hand array list
//        for(Card c : hand) {
//            if(c.getValue() <= 9) {
//                score += c.getValue();
//            } else {
//                score += 10;
//            }
//        }
//        return score;
//    }

    public String toString(Player player) {
        if(player.getName().equalsIgnoreCase("computer")) {
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
