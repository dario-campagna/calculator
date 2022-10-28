package dssc.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorReturns {

    @Test
    void same_number_for_given_number() {
        // Arrange
        String number = "-3.14";
        Calculator calculator = new Calculator();
        // Act
        double result = calculator.compute(number);
        // Assert
        assertEquals(-3.14, result, 0.000001);
    }

    @Test
    void another_number() {
        Calculator calculator = new Calculator();
        assertEquals(100.93, calculator.compute("100.93"), 0.000001);
    }
}
