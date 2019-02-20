package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        //prompt user
        System.out.print("Enter a number: ");
        // assign input to variable as int
        int num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();

        int upperBound = 0;
        int lowerBound = 0;
        double sum = 0;
        double average = 0;
        double count = 0;

        if(num1 > num2) {
            upperBound = num1;
            lowerBound = num2;
        } else {
            upperBound = num2;
            lowerBound = num1;
        }

        for(int i = lowerBound; i <= upperBound; i++) {
            count++;
            sum += i;
        }

        average = sum / count;

        System.out.println("sum: " + sum);
        System.out.println("average: " + average);

    }
}
