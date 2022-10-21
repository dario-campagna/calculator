import dssc.calculator.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputeResultFor {

    private final Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({
            "-3.14, -3.14",
            "100, 100",
            "99.99, 99.99"
    })
    void just_a_number(double result, String number) {
        assertEquals(result, calculator.compute(number));
    }

    @ParameterizedTest
    @CsvSource({
            "2, +, 1, 3",
            "-3, +, 3.14, 0.14",
            "9, *, 8.5, 76.5",
            "-4, *, 0, -0.0",
            "4, /, 2, 2"

    })
    void single_operation(String leftOperand, String operator, String rightOperand, double result) {
        assertEquals(result, calculator.compute(leftOperand, operator, rightOperand), 0.000001);
    }

}
