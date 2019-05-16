package labs_examples.lambdas.labs;

import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */
public class Exercise_02 {
    public static void main(String[] args) {
        BiFunction<Integer, String, Boolean> bifunction = (i, s)  -> s.length() > i;
        System.out.println(bifunction.apply(5, "String!"));

        BinaryOperator<Double> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(5.4, 6.9));

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a == b;
        System.out.println(biPredicate.test(4, 6));

        DoublePredicate doublePredicate = (x) -> x > 10;
        System.out.println(doublePredicate.test(15.0));

        LongToDoubleFunction longToDoubleFunction = (x) -> x * 1.5;
        System.out.println(longToDoubleFunction.applyAsDouble(14));

        LongSupplier longSupplier = () -> Long.MAX_VALUE;
        System.out.println(longSupplier.getAsLong());

        UnaryOperator<Integer> unaryOperator = (x) -> ++x;
        System.out.println(unaryOperator.apply(5));

        Predicate<String> predicate = (a) -> a == "Hello";
        System.out.println(predicate.test("Hello"));

        ToIntBiFunction<String, String> toIntBiFunction = (a, b) -> a.length() + b.length();
        System.out.println(toIntBiFunction.applyAsInt("Hey", "Ho"));

        LongUnaryOperator longUnaryOperator = (x) -> Long.MAX_VALUE / 2 + x;
        System.out.println(longUnaryOperator.applyAsLong(3));
    }

}