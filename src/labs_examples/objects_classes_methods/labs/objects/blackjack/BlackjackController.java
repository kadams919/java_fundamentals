package labs_examples.objects_classes_methods.labs.objects.blackjack;

import java.util.Scanner;

public class BlackjackController {

    Deck deck = new Deck();

    public static void main(String[] args) {

        BlackjackController blackjackController = new BlackjackController();

        blackjackController.playBlackjack();

    }

    public void playBlackjack() {

        Player player = Player.createNewPlayer("Katie", deck);
        Player computer = Player.createNewPlayer("Computer", deck);

        Scanner scanner = new Scanner(System.in);

        boolean continuePlaying = true;
        boolean continueDealing = true;
        boolean continueComputerDealing = true;

        while (continuePlaying) {
            System.out.println("Your current hand is " + player.getBlackjackHand().toString());
            String response;
            do {

                if(continueDealing) {

                    System.out.println("Would you like another card? (y/n)");

                    response = scanner.next();

                    if (response.equalsIgnoreCase("y")) {
                        deck.deal(player);
                        System.out.println("Your current hand is " + player.getBlackjackHand().toString());
                    } else {
                        continueDealing = false;
                    }
                }

                if (playForComputer(computer)) {
                    deck.deal(computer);
                } else {
                    continueComputerDealing = false;
                }

            } while (continueDealing || continueComputerDealing);

            if ((player.getBlackjackHand().getHandValue() > computer.getBlackjackHand().getHandValue())
                    && player.getBlackjackHand().getHandValue() < 22) {

                System.out.println("Congrats! You win!");
            } else {
                System.out.println("You lose :(");
            }

            System.out.println("Your hand: " + player.getBlackjackHand().toString());
            System.out.println("Computer's hand: " + computer.getBlackjackHand().toString());

            System.out.println("Would you like to continue playing? (y/n)");

            response = scanner.next();

            if (response.equalsIgnoreCase("n")) {
                continuePlaying = false;
            } else {
                deck.shuffleDeck();
                player = Player.createNewPlayer("Katie", deck);
                computer = Player.createNewPlayer("Computer", deck);
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
