package clinicops;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * UC4: ScannerHelper with generic Enum reader.
 */
public class ScannerHelper {

    public static int readInt(Scanner scanner) {
        int value = -1;
        try {
            value = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(">> Invalid input. Please enter a number.");
        } finally {
            scanner.nextLine();
        }
        return value;
    }

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
                scanner.nextLine();
            }
        }
        return value;
    }

    /**
     * Generic method to read enum choice from user.
     * Displays all enum values as a numbered list.
     */
    public static <T extends Enum<T>> T readEnumChoice(Scanner scanner, T[] values) {
        while (true) {
            System.out.println("  Select from the following:");
            for (int i = 0; i < values.length; i++) {
                System.out.println("    " + (i + 1) + ". " + values[i]);
            }
            System.out.print("  Enter choice: ");
            int choice = readInt(scanner);

            if (choice >= 1 && choice <= values.length) {
                return values[choice - 1];
            }
            System.out.println(">> Invalid choice. Please try again.");
        }
    }

    /**
     * Reads a valid 10-digit Indian mobile number.
     */
    public static String readMobileNumber(Scanner scanner, String prompt) {
        String mobile = "";
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            mobile = scanner.nextLine().trim();
            if (mobile.matches("^[6-9]\\d{9}$")) {
                valid = true;
            } else {
                System.out.println(">> Invalid mobile number. Must be 10 digits starting with 6-9. Try again.");
            }
        }
        return mobile;
    }
}
