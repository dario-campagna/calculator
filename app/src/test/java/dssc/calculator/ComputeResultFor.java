package dssc.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputeResultFor {

    private final Calculator calculator = new Calculator();

    private static Stream<Arguments> argumentsProvider() {
        return Stream.of(
                Arguments.arguments(new String[]{"3.14"}, 3.14),
                Arguments.arguments(new String[]{"100"}, 100),
                Arguments.arguments(new String[]{"99.99"}, 99.99),
                Arguments.arguments(new String[]{"2", "+", "1"}, 3),
                Arguments.arguments(new String[]{"-3", "+", "3.14"}, 0.14),
                Arguments.arguments(new String[]{"9", "*", "8.5"}, 76.5),
                Arguments.arguments(new String[]{"-4", "*", "0"}, -0.0),
                Arguments.arguments(new String[]{"4", "/", "2"}, 2),
                Arguments.arguments(new String[]{"10.1", "-", "10"}, 0.1)
        );
    }

    @ParameterizedTest
    @MethodSource("argumentsProvider")
    void single_operation(String[] args, double result) {
        assertEquals(result, calculator.compute(args), 0.000001);
    }

}
