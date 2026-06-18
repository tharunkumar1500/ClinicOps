package clinicops;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ============================================================================
 * HELPER CLASS - ScannerHelper
 * ============================================================================
 *
 * Utility class providing safe input reading methods.
 * Handles InputMismatchException and input buffer management.
 *
 * @author Developer
 * @version 2.0
 */
public class ScannerHelper {

    /**
     * Reads an integer safely from the scanner.
     * Handles InputMismatchException and clears the buffer.
     */
    public static int readInt(Scanner scanner) {
        int value = -1;
        try {
            value = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(">> Invalid input. Please enter a number.");
        } finally {
            scanner.nextLine(); // Clear input buffer
        }
        return value;
    }

    /**
     * Reads a non-empty string with a prompt.
     */
    public static String readNonEmptyString(Scanner scanner, String prompt) {
        String input = "";
        while (input.isEmpty()) {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println(">> Input cannot be empty. Please try again.");
            }
        }
        return input;
    }

    /**
     * Reads an integer with a prompt.
     */
    public static int readIntWithPrompt(Scanner scanner, String prompt) {
        int value = -1;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            try {
                value = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println(">> Invalid input. Please enter a valid number.");
            } finally {
                scanner.nextLine(); // Clear input buffer
            }
        }
        return value;
    }
}
