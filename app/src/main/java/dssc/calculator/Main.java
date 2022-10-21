package dssc.calculator;

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        Calculator calculator = new Calculator();
        double[] allResults = calculator.compute(args);
        Arrays.stream(allResults).forEach(System.out::println);
    }
}
