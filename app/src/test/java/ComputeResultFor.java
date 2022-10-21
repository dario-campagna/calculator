import dssc.calculator.Calculator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputeResultFor {

    @ParameterizedTest
    @CsvSource({
            "-3.14, -3.14",
            "100, 100",
            "99.99, 99.99"
    })
    void just_a_number(double result, String number) {
        assertEquals(result, new Calculator().compute(number));
    }
}
