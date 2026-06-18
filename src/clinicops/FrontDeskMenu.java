package clinicops;

import java.util.Scanner;

/**
 * ============================================================================
 * MENU CLASS - FrontDeskMenu
 * ============================================================================
 *
 * Handles Front Desk Executive menu options.
 * Options: Register Patient, Book Appointment, Logout.
 * Placeholders for options 1-2 in UC1.
 *
 * @author Developer
 * @version 1.0
 */
public class FrontDeskMenu {

    /**
     * Displays the Front Desk menu and handles user choices.
     */
    public static void showMenu(Scanner scanner) {
        boolean logout = false;

        while (!logout) {
            displayFrontDeskOptions();
            int choice = ScannerHelper.readInt(scanner);

            switch (choice) {
                case 1:
                    System.out.println(">> [Placeholder] Register Patient - To be implemented.");
                    break;
                case 2:
                    System.out.println(">> [Placeholder] Book Appointment - To be implemented.");
                    break;
                case 3:
                    logout = true;
                    System.out.println(">> Logging out from Front Desk...");
                    break;
                default:
                    System.out.println(">> Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the front desk menu options.
     */
    private static void displayFrontDeskOptions() {
        System.out.println("\n--- Front Desk Executive Menu ---");
        System.out.println("1. Register Patient");
        System.out.println("2. Book Appointment");
        System.out.println("3. Logout");
        System.out.print("Enter your choice: ");
    }
}
