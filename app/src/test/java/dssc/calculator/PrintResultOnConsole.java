package dssc.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrintResultOnConsole {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void for_single_number() {
        Main.main("42");

        assertEquals("42.0\n", outputStream.toString());
    }

    @Test
    void for_arithmetic_operation() {
        Main.main("10.1","+","1");

        assertEquals("11.1\n", outputStream.toString());
    }
}
