package dssc.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Calculate {

    @Test
    void one_number() {
        // Arrange
        String number = "-3.14";
        Calculator calculator = new Calculator();
        // Act
        double result = calculator.compute(number);
        // Assert
        assertEquals(-3.14, result, 0.000001);
    }
}
