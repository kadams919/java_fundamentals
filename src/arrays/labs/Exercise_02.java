package arrays.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *  More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number from 1 to 10: ");

        int input = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            list.add(array[i]);
        }

        System.out.println("The index of " + input + " is " + list.indexOf(input));

    }
}