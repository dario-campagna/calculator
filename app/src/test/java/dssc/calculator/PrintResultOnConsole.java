package dssc.calculator;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintResultOnConsole {

    @Test
    void for_single_number() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main("42");

        assertEquals("42.0\n", outputStream.toString());
    }

    @Test
    void for_arithmetic_operation() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Main.main("10.1","+","1");

        assertEquals("11.1\n", outputStream.toString());
    }
}
