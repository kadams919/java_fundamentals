package objects_classes_methods.labs.oop.B_polymorphism.exercise01;

import java.util.Scanner;

public class Coffee implements CoffeeInterface {

    private String roast;
    private boolean milk;
    private boolean cream;
    private boolean black;
    private int sugars;

    public Coffee() {
    }

    @Override
    public void getCoffeeBeans() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like (1) Light Roast \n(2) Medium Roast " +
                "\n(3) Dark Roast? \nEnter 1 or 2 or 3");
        String response = scanner.next();
        if(response.equalsIgnoreCase("1")) {
            this.roast = "Light Roast";
        } else if(response.equalsIgnoreCase("2")){
            this.roast = "Medium Roast";
        } else {
            this.roast = "Dark Roast";
        }

        System.out.println("How many sugars would you like? \nEnter a number between 0-10");
        int sugars = scanner.nextInt();
        this.sugars = sugars;
    }

    @Override
    public void getMixers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like your coffee (1) black \n(2) with milk " +
                "\n(3) with cream? \nEnter 1, 2 or 3");
        String response = scanner.next();
        if(response.equalsIgnoreCase("1")) {
            this.black = true;
        } else if(response.equalsIgnoreCase("2")){
            this.milk = true;
        } else {
            this.cream = true;
        }
    }

    @Override
    public void makeDrink() {
        getCoffeeBeans();
        getMixers();
        System.out.println("Here is your drink! ");
        if(black) {
            System.out.print("Black coffee ");
        } else if(milk) {
            System.out.print("Coffee with milk ");
        } else {
            System.out.print("Coffee with cream ");
        }

        if(sugars > 0) {
            System.out.println(" and 0 sugars");
        } else {
            System.out.println(" and " + sugars + " sugars");
        }

    }
}
