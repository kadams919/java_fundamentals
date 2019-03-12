package labs_examples.objects_classes_methods.labs.oop.D_my_oop.card_games.blackjack;

import java.util.Scanner;

public class BlackjackController {


    BlackjackDeck blackjackDeck = new BlackjackDeck();

    public static void main(String[] args) {

        BlackjackController blackjackController = new BlackjackController();

        blackjackController.playBlackjack();

    }

    public void playBlackjack() {

        Player player = Player.createNewPlayer("Katie", blackjackDeck);
        Player computer = Player.createNewPlayer(blackjackDeck);

        Scanner scanner = new Scanner(System.in);

        boolean continuePlaying = true;
        boolean continueDealing = true;
        boolean continueComputerDealing = true;

        outer:
        while (continuePlaying) {
            System.out.println(player.getBlackjackHand().toString(player));
            String response;
            do {

                if (continueDealing) {

                    System.out.println("Would you like another card? (y/n)");

                    response = scanner.next();

                    if (response.equalsIgnoreCase("y")) {
                        blackjackDeck.deal(player);
                        if(player.getBlackjackHand().getHandValue() > 21) {
                            break;
                        }
                        System.out.println(player.getBlackjackHand().toString(player));
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

            System.out.println("Your hand: " + player.getBlackjackHand().getHandValue());
            System.out.println("Computer's hand: "
                    + computer.getBlackjackHand().getHandValue());

            if(player.getBlackjackHand().getHandValue() < 22
                    && player.getBlackjackHand().getHandValue()
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
                player = Player.createNewPlayer("Katie", blackjackDeck);
                computer = Player.createNewPlayer(blackjackDeck);
                continueDealing = true;
            }

        }

    }

    private boolean playForComputer(Player computer) {
        if (computer.getBlackjackHand().getHandValue() < 16) {
            return true;
        } else {
            return false;
        }
    }


}
