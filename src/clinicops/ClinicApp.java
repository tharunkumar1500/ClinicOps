package clinicops;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ============================================================================
 * MAIN CLASS - ClinicApp
 * ============================================================================
 *
 * UC1: Console Based Menu
 *
 * Description:
 * Main entry point for the ClinicOps application.
 * Provides role-based access control (RBAC) with menu options
 * for Clinic Admin and Front Desk Executive.
 *
 * @author Developer
 * @version 1.0
 */
public class ClinicApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitApp = false;

        System.out.println("============================================================================");
        System.out.println("        Welcome to TownClinic - ClinicOps Management System");
        System.out.println("============================================================================");

        while (!exitApp) {
            System.out.println("\n--- Select Your Role ---");
            System.out.println("1. Clinic Admin");
            System.out.println("2. Front Desk Executive");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int roleChoice = ScannerHelper.readInt(scanner);

            switch (roleChoice) {
                case 1:
                    AdminMenu.showMenu(scanner);
                    break;
                case 2:
                    FrontDeskMenu.showMenu(scanner);
                    break;
                case 3:
                    exitApp = true;
                    System.out.println("\nThank you for using ClinicOps. Goodbye!");
                    break;
                default:
                    System.out.println(">> Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
