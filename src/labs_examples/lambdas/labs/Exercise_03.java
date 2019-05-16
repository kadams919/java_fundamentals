package labs_examples.lambdas.labs;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */
public class Exercise_03 {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("It's a Car!");

        Supplier<Car> car = Car::new;
        car.get();
        Supplier<Integer> supplier = Car::getNumberOfCars;
        System.out.println("Number of cars in the lot: " + supplier.get());
    }
}

class Car {

    static int numberOfCars;

    public Car() {
        numberOfCars++;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

}