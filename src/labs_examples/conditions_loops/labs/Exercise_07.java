package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.next();

        int i = 0;

        outer: while(i < word.length()) {
            switch(word.charAt(i)) {
                case 'a':
                    System.out.println(word + ": a");
                    break outer;
                case 'e':
                    System.out.println(word + ": e");
                    break outer;
                case 'i':
                    System.out.println(word + ": i");
                    break outer;
                case 'o':
                    System.out.println(word + ": o");
                    break outer;
                case 'u':
                    System.out.println(word + ": u");
                    break outer;
                case 'y':
                    System.out.println(word + ": y");
                    break outer;
                default:
                    i++;
                    break;
            }
        }
    }
}
