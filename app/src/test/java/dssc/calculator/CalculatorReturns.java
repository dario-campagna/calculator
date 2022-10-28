package dssc.calculator;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorReturns {

    @Test
    void same_number_for_given_number() {
        Calculator calculator = new Calculator();
        assertEquals(-3.14, calculator.compute("-3.14"), 0.000001);
    }

    @Test
    void another_number() {
        Calculator calculator = new Calculator();
        assertEquals(100.93, calculator.compute("100.93"), 0.000001);
    }

    @Test
    void yet_another_number() {
        Calculator calculator = new Calculator();
        assertEquals(0.1, calculator.compute("0.1"), 0.000001);
    }

    @Test
    void sum_of_two_number() {
        Calculator calculator = new Calculator();
        assertEquals(10.1, calculator.compute("6","+","4.1"), 0.000001);
    }
}
