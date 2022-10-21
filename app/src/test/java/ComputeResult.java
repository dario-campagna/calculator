import dssc.calculator.Calculator;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComputeResult {

    @Test
    void one_number() {
        Calculator calculator = new Calculator();
        assertEquals(-3.14, calculator.compute("-3.14"));
    }

}
