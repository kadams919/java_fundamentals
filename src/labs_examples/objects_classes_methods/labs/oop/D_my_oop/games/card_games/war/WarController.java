package labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.war;

import labs_examples.objects_classes_methods.labs.oop.D_my_oop.games.card_games.common.Card;

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

        WarPlayer warPlayer = new WarPlayer("Katie", warDeck);
        WarPlayer computer = new WarPlayer("Computer", warDeck);

        Scanner scanner = new Scanner(System.in);

        boolean continueDealing = true;
        int totalCards = 0;


            do {

                goToWar(warPlayer, computer);

                System.out.println("Number of cards in hand: " + warPlayer.getWarHand().getHand().size());
                System.out.println("Would you like to keep playing?");
                String response = scanner.next();

                if(response.equalsIgnoreCase("n")) {
                    continueDealing = false;
                }
            } while (continueDealing
                    && warPlayer.getWarHand().getHand().size() > 0
                    && computer.getWarHand().getHand().size() > 0);

    }

    public void printCards(List<Card> playerCards, List<Card> computerCards,
                           Card playerCard, Card computerCard,
                           int numPlayerCards, int numComputerCards) {

        int playerCardVal = playerCard.getValue();
        int computerCardVal = computerCard.getValue();

        char playerSuit = playerCard.getSuit();
        char computerSuit = computerCard.getSuit();

        System.out.println("Your card:" + "    " + "Computer's card:");

        int difference = 0;

        if (numPlayerCards > numComputerCards) {
            difference = numPlayerCards - numComputerCards;
            for(int i = 0; i < numPlayerCards; i++) {
                if(difference > 0) {
                    System.out.println("┌─────────┐             ");
                    difference--;
                } else {
                    System.out.println("┌─────────┐    ┌─────────┐");
                }
            }
        } else if(numComputerCards > numPlayerCards){
            difference = numComputerCards - numPlayerCards;
            for(int i = 0; i < numComputerCards; i++) {
                if(difference > 0) {
                    System.out.println("             ┌─────────┐");
                    difference--;
                } else {
                    System.out.println("┌─────────┐    ┌─────────┐");
                }
            }
        } else if (numPlayerCards > 1 && numComputerCards > 1){
            for(int i = 0; i < numPlayerCards; i++) {
                System.out.println("┌─────────┐    ┌─────────┐");
            }
        } else {
            System.out.println("┌─────────┐    ┌─────────┐");
        }

        System.out.printf("|%s        |    |%s        |",
                playerSuit,
                computerSuit);
        System.out.println("\n|         |    |         |");
        System.out.println("|         |    |         |");
        System.out.printf("|    %d    |    |    %d    |",
                playerCardVal, computerCardVal);
        System.out.println("\n|         |" + "    " + "|         |");
        System.out.println("|         |" + "    " + "|         |");
        System.out.printf("|        %s|    |        %s|",
                playerSuit,
                computerSuit);
        System.out.println("\n└─────────┘    └─────────┘");
    }

    private void goToWar(WarPlayer warPlayer, WarPlayer computer) {
        List<Card> playersWarCards = new ArrayList<>();
        List<Card> computersWarCards = new ArrayList<>();

        List<Card> playersCards = warPlayer.getWarHand().getHand();
        List<Card> computersCards = computer.getWarHand().getHand();

        printCards(playersCards, computersCards, playersCards.get(0),
                    computersCards.get(0), 1, 1);

        if (playersCards.get(0).getValue()
                    > computersCards.get(0).getValue()) {

            System.out.println("You win this round of war!");
            giveWinnerCards(warPlayer, computer, playersCards, computersCards, 1, 1);
            playersWarCards.clear();
            computersWarCards.clear();

        } else if (computersCards.get(0).getValue()
                    > playersCards.get(0).getValue()) {

            System.out.println("Computer wins this round of war!");
            giveWinnerCards(computer, warPlayer, computersCards, playersCards, 1, 1);
            playersWarCards.clear();
            computersWarCards.clear();

        } else {
            System.out.println("It's a tie! To War!");
            breakTie(warPlayer, computer, playersWarCards, computersWarCards);
        }
    }

    private void breakTie(WarPlayer warPlayer, WarPlayer computer, List<Card> playersWarCards,
                          List<Card> computersWarCards) {

        addWarCards(warPlayer, computer, playersWarCards, computersWarCards);

        printCards(playersWarCards, computersWarCards, playersWarCards.get(playersWarCards.size() - 1),
                computersWarCards.get(computersWarCards.size() - 1),
                playersWarCards.size(), computersWarCards.size());

        if(playersWarCards.get(playersWarCards.size() - 1).getValue()
                > computersWarCards.get(computersWarCards.size() - 1).getValue()) {

            System.out.println("You win this one!");
            giveWinnerCards(warPlayer, computer, playersWarCards, computersWarCards,
                    playersWarCards.size(), computersWarCards.size());

        } else if(computersWarCards.get(computersWarCards.size() - 1).getValue()
                > playersWarCards.get(playersWarCards.size() - 1).getValue()) {

            System.out.println("Computer wins this one!");
            giveWinnerCards(computer, warPlayer, computersWarCards, playersWarCards,
                    computersWarCards.size(), playersWarCards.size());

        } else {

            System.out.println("Another tie!");
            breakTie(warPlayer, computer, playersWarCards, computersWarCards);

        }
    }

    private void addWarCards(WarPlayer warPlayer, WarPlayer computer, List<Card> playersWarCards, List<Card> computersWarCards) {

        if(warPlayer.getWarHand().getHand().size() < 3 || computer.getWarHand().getHand().size() < 3) {
            if(warPlayer.getWarHand().getHand().size() < 3 ) {
                int playerNumCards = warPlayer.getWarHand().getHand().size() - 1;
                for (int i = 0; i < playerNumCards; i++) {
                    playersWarCards.add(warPlayer.getWarHand().getHand().get(i));
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
                playersWarCards.add(warPlayer.getWarHand().getHand().get(i));
            }
        }
    }

    private void giveWinnerCards(WarPlayer winner, WarPlayer loser, List<Card> winnerHand,
                                 List<Card> loserHand, int winnerCardsToGive,
                                 int loserCardsToGive) {

        for(int i = 0; i < winnerCardsToGive; i++) {
            winner.getWarHand().getHand().add(winnerHand.get(0));
            winner.getWarHand().getHand().remove(0);
        }

        for(int i = 0; i < loserCardsToGive; i++) {
            winner.getWarHand().getHand().add(loserHand.get(0));
            loser.getWarHand().getHand().remove(0);
        }
    }
}
