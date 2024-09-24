package com.billyzapp.modeplay;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentKeyTest {

    @Test
    public void testGetValidKey_WithValidInput() {
        // Simulate user input "C" using ByteArrayInputStream
        ByteArrayInputStream in = new ByteArrayInputStream("C\n".getBytes());
        Scanner scanner = new Scanner(in);

        // Call the method and assert that the returned value is "C"
        String result = CurrentKey.getValidKey(scanner, "Enter a musical key: ");
        assertEquals("C", result);
    }

    @Test
    public void testGetValidKey_WithLowerCaseInput() {
        // Simulate user input with lowercase "d"
        ByteArrayInputStream in = new ByteArrayInputStream("d\n".getBytes());
        Scanner scanner = new Scanner(in);

        // Call the method and assert that the returned value is "D" (uppercase)
        String result = CurrentKey.getValidKey(scanner, "Enter a musical key: ");
        assertEquals("D", result);
    }
}
