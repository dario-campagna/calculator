import dssc.calculator.Calculator;
import org.junit.jupiter.api.Test;
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

    @Test
    void two_plus_one() {
        assertEquals(3, new Calculator().compute("2", "+", "1"));
    }

    @Test
    void minus_3_plus_pi() {
        assertEquals(0.14, new Calculator().compute("-3", "+", "3.14"), 0.000001);
    }

    @Test
    void nine_times_8_point_5() {
        assertEquals(76.5, new Calculator().compute("9", "*", "8.5"), 0.000001);
    }
}
