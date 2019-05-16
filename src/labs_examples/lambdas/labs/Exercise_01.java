package labs_examples.lambdas.labs;

import java.lang.FunctionalInterface;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */
public class Exercise_01 {

    public static void main(String[] args) {
        FunctionalInterfaceExample myFuncInterface = () -> {
            System.out.println("New thread created");
        };
        myFuncInterface.exampleMethod();

        FunctionalInterfaceOneParam functionalInterfaceOneParam = (x) -> {
            System.out.println("The int is " + x);
        };
        functionalInterfaceOneParam.exampleMethod(5);

        FunctionalInterfaceTwoParams functionalInterfaceTwoParams = (a, b) -> {
            System.out.println("THe first string is " + a + " and the second string is " + b);
        };
        functionalInterfaceTwoParams.exampleMethod("Hi!", "Bye!");

        Supplier<Double> randomVal = () -> Math.random();

        System.out.println(randomVal.get());
    }
}

@FunctionalInterface
interface FunctionalInterfaceExample {
    public void exampleMethod();
}

@FunctionalInterface
interface FunctionalInterfaceOneParam {
    public void exampleMethod(int a);
}

@FunctionalInterface
interface FunctionalInterfaceTwoParams {
    public void exampleMethod(String a, String b);
}


