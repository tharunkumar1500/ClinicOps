package clinicops;

import java.util.Scanner;

/**
 * ============================================================================
 * MENU CLASS - AdminMenu
 * ============================================================================
 *
 * UC2: Handles Clinic Admin menu options including Doctor's Entry.
 * Stores doctor data using static class-level variables.
 *
 * @author Developer
 * @version 2.0
 */
public class AdminMenu {

    // Static class-level variables to hold doctor data
    private static String[] doctorNames = new String[3];
    private static String[] doctorSpecializations = new String[3];
    private static int[] doctorExperience = new int[3];
    private static int doctorCount = 0;

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
                    registerDoctors(scanner);
                    break;
                case 2:
                    System.out.println(">> [Placeholder] Bulk Entry - To be implemented.");
                    break;
                case 3:
                    System.out.println(">> [Placeholder] Audit - To be implemented.");
                    break;
                case 4:
                    displayDoctors();
                    break;
                case 5:
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
        System.out.println("4. Display Doctor's List");
        System.out.println("5. Logout");
        System.out.print("Enter your choice: ");
    }

    /**
     * Registers 3 doctors' details with input validation.
     */
    private static void registerDoctors(Scanner scanner) {
        System.out.println("\n--- Register Doctors (Enter 3 Doctors) ---");
        doctorCount = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("\nDoctor " + (i + 1) + ":");
            doctorNames[i] = ScannerHelper.readNonEmptyString(scanner, "  Enter Name: ");
            doctorSpecializations[i] = ScannerHelper.readNonEmptyString(scanner, "  Enter Specialization: ");
            doctorExperience[i] = ScannerHelper.readIntWithPrompt(scanner, "  Enter Experience (years): ");
            doctorCount++;
        }

        System.out.println("\n>> 3 Doctors registered successfully!");
    }

    /**
     * Displays all registered doctors.
     */
    private static void displayDoctors() {
        if (doctorCount == 0) {
            System.out.println("\n>> No doctors registered yet.");
            return;
        }

        System.out.println("\n============================================================================");
        System.out.println("                      Registered Doctors List");
        System.out.println("============================================================================");
        System.out.printf("%-5s | %-20s | %-20s | %-10s%n", "No.", "Name", "Specialization", "Exp (yrs)");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < doctorCount; i++) {
            System.out.printf("%-5d | %-20s | %-20s | %-10d%n",
                    (i + 1), doctorNames[i], doctorSpecializations[i], doctorExperience[i]);
        }
        System.out.println("============================================================================");
    }
}
