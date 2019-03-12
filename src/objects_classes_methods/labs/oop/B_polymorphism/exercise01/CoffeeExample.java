package objects_classes_methods.labs.oop.B_polymorphism.exercise01;

import java.util.Scanner;

public class CoffeeExample {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();

        Americano americano = new Americano();

        Cappucino cappucino = new Cappucino();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like a (1) Coffee \n(2) Americano or " +
                "\n(3) Cappucino? \nEnter 1, 2 or 3");
        String response = scanner.next();
        if(response.equalsIgnoreCase("1")) {
            coffee.makeDrink();
        } else if(response.equalsIgnoreCase("2")) {
            americano.makeDrink();
        } else {
            cappucino.makeDrink();
        }
    }
}
