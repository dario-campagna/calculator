package dssc.calculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintOnConsole {

    @Test
    void result_of_computation_for_single_number() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main("42");

        assertEquals("42.0\n", outputStream.toString());
    }

    @Test
    void result_of_computation_for_operation() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main("10.1","+","1");

        assertEquals("11.1\n", outputStream.toString());
    }
}
