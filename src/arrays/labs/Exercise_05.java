package arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        int[] arr = new int[16];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for(int i = 15; i >= 0; i--) {
            System.out.print(arr[i] + " ");
            i--;
        }
    }

}
