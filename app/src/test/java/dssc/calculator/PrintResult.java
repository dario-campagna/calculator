package dssc.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintResult {

    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setSystemOut() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void print_number_passed_as_argument() {
        Main.main(new String[]{"45.9"});
        assertEquals("45.9\n", outputStream.toString());
    }

    @Test
    void print_result_of_arithmetic_operation() {
        Main.main(new String[]{"45", "*", "-11.4"});
        assertEquals("-513.0\n", outputStream.toString());
    }

}
