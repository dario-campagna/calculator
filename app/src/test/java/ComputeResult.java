import dssc.calculator.Calculator;
import org.junit.jupiter.api.Test;

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
}
