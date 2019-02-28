package objects_classes_methods.labs.methods;

import java.util.ArrayList;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        System.out.println("3 x 2 = " + multiply(3, 2));
        System.out.println("------------------------------");
        System.out.println("10 / 5 = " + divide(10, 5));
        System.out.println("------------------------------");
        joke();
        System.out.println("------------------------------");
        System.out.println("3 years in seconds is " + convertYearsToSeconds(3));
        System.out.println("------------------------------");
        System.out.println("The number of arguments called is " + varArgs(1,2,3,4,5));

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke() {
        System.out.println("A manager, a mechanical engineer, and software analyst are driving back " +
                        "from convention through the mountains. \nSuddenly, as they crest a hill, the " +
                        "brakes on the car go out and they fly careening down the mountain. \nAfter " +
                        "scraping against numerous guardrails, they come to a stop in the ditch. " +
                        "Everyone gets out of the car to \nassess the damage. \n\nThe manager says, " +
                        "\"Let's form a group to collaborate ideas on how we can solve this issue. " +
                        "\n\nThe mechanical engineer suggests, \"We should disassemble the car and " +
                        "analyze each part for failure.\" \n\nThe software analyst says, \"Let's push " +
                        "it back up the hill and see if it does it again.");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static long convertYearsToSeconds(int years) {
        long seconds = years * 365 * 24 * 60 * 60;
        return seconds;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int varArgs(int... items) {
        int count = 0;
        for(int i : items) {
            count++;
        }
        return count;
    }





}
