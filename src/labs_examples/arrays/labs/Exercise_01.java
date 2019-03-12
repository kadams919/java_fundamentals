package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {

        float[] arr = new float[10];
        float sum = 0;
        float avg = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {

            System.out.println("Please enter a number: ");

            arr[i] = scanner.nextInt();
        }

        for(float item : arr) {
            sum += item;
        }

        avg = sum / arr.length;

        System.out.println("The sum is " + sum + " and the average is " + avg);

    }

}