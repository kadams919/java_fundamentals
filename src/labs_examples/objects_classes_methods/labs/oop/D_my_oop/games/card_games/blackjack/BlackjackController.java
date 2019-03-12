package labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.blackjack;

import java.util.Scanner;

public class BlackjackController {


    BlackjackDeck blackjackDeck = new BlackjackDeck();

    public static void main(String[] args) {

        BlackjackController blackjackController = new BlackjackController();

        blackjackController.playBlackjack();

    }

    public void playBlackjack() {

        BlackjackPlayer blackjackPlayer = BlackjackPlayer.createNewPlayer("Katie", blackjackDeck);
        BlackjackPlayer computer = BlackjackPlayer.createNewPlayer(blackjackDeck);

        Scanner scanner = new Scanner(System.in);

        boolean continuePlaying = true;
        boolean continueDealing = true;
        boolean continueComputerDealing = true;

        outer:
        while (continuePlaying) {
            System.out.println(blackjackPlayer.getBlackjackHand().toString(blackjackPlayer));
            String response;
            do {

                if (continueDealing) {

                    System.out.println("Would you like another card? (y/n)");

                    response = scanner.next();

                    if (response.equalsIgnoreCase("y")) {
                        blackjackDeck.deal(blackjackPlayer);
                        if(blackjackPlayer.getBlackjackHand().getHandValue() > 21) {
                            break;
                        }
                        System.out.println(blackjackPlayer.getBlackjackHand().toString(blackjackPlayer));
                    } else {
                        continueDealing = false;
                    }
                }

                if (playForComputer(computer)) {
                    blackjackDeck.deal(computer);
                } else {
                    continueComputerDealing = false;
                }


            } while (continueDealing || continueComputerDealing);

            System.out.println("Your hand: " + blackjackPlayer.getBlackjackHand().getHandValue());
            System.out.println("Computer's hand: "
                    + computer.getBlackjackHand().getHandValue());

            if(blackjackPlayer.getBlackjackHand().getHandValue() < 22
                    && blackjackPlayer.getBlackjackHand().getHandValue()
                    > computer.getBlackjackHand().getHandValue()) {
                System.out.println("Congrats!!! You win!!!");
            } else {
                System.out.println("You lose :( \nBetter luck next time.");
            }
            System.out.println("Would you like to play another game? (y/n)");

            response = scanner.next();

            if (response.equalsIgnoreCase("n")) {
                continuePlaying = false;
            } else {
                blackjackDeck.shuffleDeck();
                blackjackPlayer = BlackjackPlayer.createNewPlayer("Katie", blackjackDeck);
                computer = BlackjackPlayer.createNewPlayer(blackjackDeck);
                continueDealing = true;
            }

        }

    }

    private boolean playForComputer(BlackjackPlayer computer) {
        if (computer.getBlackjackHand().getHandValue() < 16) {
            return true;
        } else {
            return false;
        }
    }


}
