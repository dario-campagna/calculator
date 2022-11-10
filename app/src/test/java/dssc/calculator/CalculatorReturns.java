package dssc.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorReturns {

    @ParameterizedTest
    @MethodSource("singleNumbers")
    void same_number_for_single_number(String numberAsString, double expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.compute(numberAsString), 0.000001);
    }

    private static Stream<Arguments> singleNumbers() {
        return Stream.of(
                Arguments.arguments("-3.14", -3.14)
        );
    }

    @Test
    void sum_of_two_number() {
        Calculator calculator = new Calculator();
        assertEquals(10.1, calculator.compute("6","+","4.1"), 0.000001);
    }

    @Test
    void difference_of_two_number() {
        Calculator calculator = new Calculator();
        assertEquals(100.6, calculator.compute("104.6","-","4"), 0.000001);
    }

    @Test
    void product_of_two_numbers() {
        Calculator calculator = new Calculator();
        assertEquals(76.5, calculator.compute("8.5","*","9"), 0.000001);
    }

    @Test
    void quotient_of_two_numbers() {
        Calculator calculator = new Calculator();
        assertEquals(1.8, calculator.compute("3.6","/","2"), 0.000001);
    }
}
