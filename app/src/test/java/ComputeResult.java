import dssc.calculator.Calculator;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputeResult {

    @Test
    void one_number() {
        Calculator calculator = new Calculator();
        assertEquals(-3.14, calculator.compute("-3.14"));
    }

    @Test
    void another_number() {
        Calculator calculator = new Calculator();
        assertEquals(100, calculator.compute("100"));
    }

    @Test
    void yet_another_number() {
        Calculator calculator = new Calculator();
        assertEquals(99.99, calculator.compute("99.99"));
    }
}
