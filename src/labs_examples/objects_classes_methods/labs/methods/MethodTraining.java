package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MethodTraining {

    public static void main(String[] args) {

        System.out.println("#1------------------------------");
        methodOverloading(1);
        methodOverloading(1,2);
        methodOverloading(1,2,3);

        System.out.println("#2------------------------------");
        int a = 10;
        System.out.println("before passByValue method call: " + a);
        passByValue(a);
        System.out.println("after passByValue method call: " + a);
        a = passByReference(a);
        System.out.println("after passByReference method call: " + a);

        System.out.println("#3------------------------------");
        System.out.println("The largest number of 1, 2, 3, and 4 is "
                + getLargest(1,2,3,4));

        System.out.println("#4------------------------------");
        System.out.println("The number of consonants in 'abracadabra' is "
                + countConsonants("abracadabra"));

        System.out.println("#5------------------------------");
        printAsciiArt();

        System.out.println("#6------------------------------");
        double num = 17;
        System.out.println("Is the number " + num + " prime? " + isPrime(num));

        System.out.println("#7------------------------------");
        int[] arr = {3, 2, 6, 3, 7, 2, 1};
        int big = (smallAndBig(arr))[1];
        int small = (smallAndBig(arr))[0];
        System.out.println("In 3, 2, 6, 3, 7, 2, 1, the biggest number is " + big
                + " and the smallest number is " + small);

        System.out.println("#8------------------------------");
        int len = findDivisible(100, 5, 10).size();
        System.out.println("The number of numbers divisible by both 5 and 10 less than 100: "
                + len);

        System.out.println("#9------------------------------");
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original array: 1,2,3,4,5,6,7,8,9,10");
        int[] arr3 = reverseArray(arr2);
        System.out.println("Reversed in place array: ");
        for(int i : arr3) {
            System.out.print(i + ",");
        }

    }

    // 1) Demonstrate method overloading in this class
    public static void methodOverloading(int a) {

        System.out.println("This method passes in " + a);

    }

    public static void methodOverloading(int a, int b) {

        System.out.println("This method passes in " + a + " + " + b);

    }

    public static void methodOverloading(int a, int b, int c) {

        System.out.println("This method passes in " + a + " + " + b + " + " + c);

    }

    // 2) Demonstrate the difference between "pass by value" and "pass by reference"

    public static void passByValue(int a) {

        a += 10;

    }

    public static int passByReference(int a) {

        return a += 10;

    }

    // 3) Create a method that will return the largest of 4 numbers (all of which
    // are passed in as arguments)

    public static int getLargest(int... nums) {
        int max = nums[0];

        for(int i : nums) {
            if(i > max) {
                max = i;
            }
        }

        return max;
    }

    // 4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String string) {
        int count = 0;

        for(int i = 0; i < string.length(); i++) {
            char s = string.charAt(i);

            if(s != 'a' && s != 'e' && s != 'i' && s != 'o' && s != 'u' && s != 'y') {
                count++;
            }
        }
        return count;
    }

    // 5) Write a method that will print some kind of ascii art to the console (Google
    // "ascii art" if needed)

    public static void printAsciiArt() {
        System.out.println();
        System.out.println();
        System.out.println("    /\\_/\\           ___");
        System.out.println("   = o_o =_______    \\ \\");
        System.out.println("    __^      __(  \\.__) )");
        System.out.println("(@)<_____>__(_____)____/");
        System.out.println();
        System.out.println();
    }

    // 6) Write a method that will determine whether or not a number is prime

    public static boolean isPrime(double num) {
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 7) Write a method that will return a small array containing the highest and
    // lowest numbers in a given numeric array, which is passed in as an argument

    public static int[] smallAndBig(int[] arr) {
        int small = arr[0];
        int big = arr[0];
        int[] answer = new int[2];

        for(int i : arr) {
            if(i < small) {
                small = i;
            } else if(i > big) {
                big = i;
            }
        }
        answer[0] = small;
        answer[1] = big;

        return answer;
    }

    // 8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2)
    // and returns an Integer Arraylist. In this method create an Integer ArrayList and
    // populate it with each number between zero and maxNum that is divisible by both
    // divisor1 and divisor2. Then return this ArrayList. After calling this method, print
    // out the length of the returned list

    public static ArrayList<Integer> findDivisible(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < maxNum; i++) {
            if(i % divisor1 == 0 && i % divisor2 == 0) {
                arrayList.add(i);
            }
        }

        return arrayList;

    }

    // 9) Write a method that will reverse an array in place use only one extra temp
    // variable. For this exercise you cannot instantiate a second array. You must
    // reverse the array in place using only one extra temp variable. Hint: this
    // variable is used to temporarily store individual values in the array

    public static int[] reverseArray(int[] arr) {
        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }

}
