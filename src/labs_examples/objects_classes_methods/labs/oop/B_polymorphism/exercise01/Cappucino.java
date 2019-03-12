package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.exercise01;

import java.util.Scanner;

public class Cappucino extends Coffee implements CoffeeInterface {

    private String mixer;

    public Cappucino() {
    }


    @Override
    public void getMixers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What flavor of cappucino would you like? " +
                "\n(1) Vanilla \n(2) Mocha \n(3) Caramel \nEnter 1, 2, or 3");
        String response = scanner.next();
        if(response.equalsIgnoreCase("1")) {
            this.mixer = "Vanilla";
        } else if(response.equalsIgnoreCase("2")) {
            this.mixer = "Mocha";
        } else {
            this.mixer = "Caramel";
        }

    }

    @Override
    public void makeDrink() {
        getMixers();
        System.out.println("Here is your " + mixer + " cappucino!");

    }
}
