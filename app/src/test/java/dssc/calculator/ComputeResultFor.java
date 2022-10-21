package dssc.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ComputeResultFor {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest
    @MethodSource("argumentsAndResults")
    void single_operation(String[] args, double[] results) {
        assertArrayEquals(results, calculator.compute(args), 0.000001);
    }

    private static Stream<Arguments> argumentsAndResults() {
        return Stream.of(
                Arguments.arguments(new String[]{"3.14"}, new double[]{3.14}),
                Arguments.arguments(new String[]{"100"}, new double[]{100}),
                Arguments.arguments(new String[]{"99.99"}, new double[]{99.99}),
                Arguments.arguments(new String[]{"2", "+", "1"}, new double[]{3}),
                Arguments.arguments(new String[]{"-3", "+", "3.14"}, new double[]{0.14}),
                Arguments.arguments(new String[]{"9", "*", "8.5"}, new double[]{76.5}),
                Arguments.arguments(new String[]{"-4", "*", "0"}, new double[]{-0.0}),
                Arguments.arguments(new String[]{"4", "/", "2"}, new double[]{2}),
                Arguments.arguments(new String[]{"10.1", "-", "10"}, new double[]{0.1}),
                Arguments.arguments(new String[]{"6", "+", "4.1", "*", "3"}, new double[]{10.1, 30.3})
        );
    }

}
