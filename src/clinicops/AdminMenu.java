package clinicops;

import java.util.Scanner;

/**
 * ============================================================================
 * MENU CLASS - AdminMenu
 * ============================================================================
 *
 * Handles Clinic Admin menu options.
 * Options: Doctors' Entry, Bulk Entry, Audit, Logout.
 * Placeholders for options 1-3 in UC1.
 *
 * @author Developer
 * @version 1.0
 */
public class AdminMenu {

    /**
     * Displays the Admin menu and handles user choices.
     */
    public static void showMenu(Scanner scanner) {
        boolean logout = false;

        while (!logout) {
            displayAdminOptions();
            int choice = ScannerHelper.readInt(scanner);

            switch (choice) {
                case 1:
                    System.out.println(">> [Placeholder] Doctor's Entry - To be implemented.");
                    break;
                case 2:
                    System.out.println(">> [Placeholder] Bulk Entry - To be implemented.");
                    break;
                case 3:
                    System.out.println(">> [Placeholder] Audit - To be implemented.");
                    break;
                case 4:
                    logout = true;
                    System.out.println(">> Logging out from Admin...");
                    break;
                default:
                    System.out.println(">> Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the admin menu options.
     */
    private static void displayAdminOptions() {
        System.out.println("\n--- Clinic Admin Menu ---");
        System.out.println("1. Doctor's Entry");
        System.out.println("2. Bulk Entry");
        System.out.println("3. Audit");
        System.out.println("4. Logout");
        System.out.print("Enter your choice: ");
    }
}
