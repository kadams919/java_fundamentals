package objects_classes_methods.labs.oop.C_blackjack.war;

import objects_classes_methods.labs.oop.C_blackjack.card_games.Card;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarController {

    WarDeck warDeck = new WarDeck();

    public static void main(String[] args) {
        WarController warController = new WarController();

        warController.playWar();

    }

    public void playWar() {

        Player player = Player.createNewPlayer("Katie", warDeck);
        Player computer = Player.createNewPlayer(warDeck);

        Scanner scanner = new Scanner(System.in);

        boolean continueDealing = true;
        int totalCards = 0;


            do {

                goToWar(player, computer);

                System.out.println("Number of cards in hand: " + player.getWarHand().getHand().size());
                System.out.println("Would you like to keep playing?");
                String response = scanner.next();

                if(response.equalsIgnoreCase("n")) {
                    continueDealing = false;
                }
            } while (continueDealing
                    && player.getWarHand().getHand().size() > 0
                    && computer.getWarHand().getHand().size() > 0);

    }

    public void printCards(Player player, Player computer, int numCards, Card playerCard, Card computerCard) {
        System.out.println("Your card:" + "    " + "Computer's card:");
        System.out.println("┌─────────┐    ┌─────────┐");

        //for(int i = 1; i < numCards - 1; i++) {
        //    System.out.println("┌─────────┐    ┌─────────┐");
        //}
        System.out.printf("|%s        |    |%s        |",
                playerCard.getSuit(),
                computerCard.getSuit());
        System.out.println("\n|         |    |         |");
        System.out.println("|         |    |         |");
        System.out.printf("|    %d    |    |    %d    |",
                playerCard.getValue(),
                computerCard.getValue());
        System.out.println("\n|         |" + "    " + "|         |");
        System.out.println("|         |" + "    " + "|         |");
        System.out.printf("|        %s|    |        %s|",
                playerCard.getSuit(),
                computerCard.getSuit());
        System.out.println("\n└─────────┘    └─────────┘");
    }

    private void goToWar(Player player, Player computer) {
        List<Card> playersWarCards = new ArrayList<>();
        List<Card> computersWarCards = new ArrayList<>();

        List<Card> playersCards = player.getWarHand().getHand();
        List<Card> computersCards = computer.getWarHand().getHand();

        printCards(player, computer, 1, playersCards.get(0),
                    computersCards.get(0));

        if (playersCards.get(0).getValue()
                    > computersCards.get(0).getValue()) {

            System.out.println("You win this round of war!");
            giveWinnerCards(player, computer, playersCards, computersCards, 1);
            playersWarCards.clear();
            computersWarCards.clear();

        } else if (computersCards.get(computersCards.size() - 1).getValue()
                    > playersCards.get(playersCards.size() - 1).getValue()) {

            System.out.println("Computer wins this round of war!");
            giveWinnerCards(computer, player, computersCards, playersCards, 1);
            playersWarCards.clear();
            computersWarCards.clear();

        } else {
            System.out.println("It's a tie! To War!");
            breakTie(player, computer, playersWarCards, computersWarCards, 3);
        }
    }

    private void breakTie(Player player, Player computer, List<Card> playersWarCards, List<Card> computersWarCards, int numCards) {
        addWarCards(player, computer, playersWarCards, computersWarCards);

//


    }

    private void addWarCards(Player player, Player computer, List<Card> playersWarCards, List<Card> computersWarCards) {

        if(player.getWarHand().getHand().size() < 3 || computer.getWarHand().getHand().size() < 3) {
            if(player.getWarHand().getHand().size() < 3 ) {
                int playerNumCards = player.getWarHand().getHand().size() - 1;
                for (int i = 0; i < playerNumCards; i++) {
                    playersWarCards.add(player.getWarHand().getHand().get(i));
                }
            }

            if(computer.getWarHand().getHand().size() < 3) {
                int computerNumCards = computer.getWarHand().getHand().size() - 1;
                for(int i = 0; i < computerNumCards; i++) {
                    computersWarCards.add(computer.getWarHand().getHand().get(i));
                }
            }
        } else {
            for(int i = 0; i < 3; i++) {
                computersWarCards.add(computer.getWarHand().getHand().get(i));
                playersWarCards.add(player.getWarHand().getHand().get(i));
            }
        }
    }

    private void giveWinnerCards(Player winner, Player loser, List<Card> winnerHand, List<Card> loserHand, int numCardsToGive) {


        for(int i = 0; i < numCardsToGive; i++) {
            Card winnerCard = winnerHand.get(0);
            Card loserCard = loserHand.get(0);

            winner.getWarHand().getHand().add(loserCard);
            winner.getWarHand().getHand().remove(0);
            winner.getWarHand().getHand().add(winnerCard);
            loser.getWarHand().getHand().remove(loserCard);
        }
    }
}
