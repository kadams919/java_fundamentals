package objects_classes_methods.labs.objects.blackjack;

import java.util.Scanner;

public class BlackjackController {

    Deck deck = new Deck();

    public static void main(String[] args) {

        BlackjackController blackjackController = new BlackjackController();

        blackjackController.playBlackjack();

    }

    public void playBlackjack() {

        Player player = createNewPlayer("Katie");
        Player computer = createNewPlayer("Computer");

        Scanner scanner = new Scanner(System.in);

        boolean continuePlaying = true;

        while (continuePlaying) {
            System.out.println("Your current hand is " + player.getBlackjackHand().toString());

            System.out.println("Would you like another card? (y/n)");

            String response = scanner.next();

            if (response.equalsIgnoreCase("y")) {
                deck.deal(player);
                System.out.println("Your current hand is " + player.getBlackjackHand().toString());
            }

            if (playForComputer(computer)) {
                deck.deal(computer);
            }

            System.out.println("Would you like to continue playing? (y/n)");

            response = scanner.next();

            if (response.equalsIgnoreCase("n")) {
                continuePlaying = false;
            }

        }

        if ((player.getBlackjackHand().getHandValue() > computer.getBlackjackHand().getHandValue())
                && player.getBlackjackHand().getHandValue() < 22) {

            System.out.println("Congrats! You win!");
        } else {
            System.out.println("You lose :(");
        }

        System.out.println("Your hand: " + player.getBlackjackHand().toString());
        System.out.println("Computer's hand: " + computer.getBlackjackHand().toString());

    }

    private boolean playForComputer(Player computer) {
        if (computer.getBlackjackHand().getHandValue() < 16) {
            return true;
        } else {
            return false;
        }
    }

    private Player createNewPlayer(String name) {
        Player player = new Player(name, 10);
        deck.deal(player);
        deck.deal(player);

        return player;
    }
}
