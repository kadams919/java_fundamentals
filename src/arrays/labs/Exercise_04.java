package arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int[][] array = {
                { 3, 2, 4 },
                { 6, 1 },
                { 7, 9, 3, 7, 5}
        };

        for(int[] arr : array) {
            for(int item : arr) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }


}
