package clinicops;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ============================================================================
 * MENU CLASS - AdminMenu
 * ============================================================================
 *
 * UC3: Refactored to use Doctor class and ArrayList.
 * Auto-generates IDs using idCounter.
 *
 * @author Developer
 * @version 3.0
 */
public class AdminMenu {

    // Refactored: ArrayList of Doctor objects instead of static arrays
    private static ArrayList<Doctor> doctorList = new ArrayList<>();
    private static int idCounter = 1;

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
     * Registers a doctor using Doctor object and adds to doctorList.
     */
    private static void registerDoctors(Scanner scanner) {
        System.out.println("\n--- Register Doctor ---");

        String name = ScannerHelper.readNonEmptyString(scanner, "  Enter Name: ");
        String specialization = ScannerHelper.readNonEmptyString(scanner, "  Enter Specialization: ");
        int experience = ScannerHelper.readIntWithPrompt(scanner, "  Enter Experience (years): ");
        String shift = ScannerHelper.readNonEmptyString(scanner, "  Enter Shift (Morning/Evening/Both): ");

        // Auto-generate ID
        String id = String.format("D%04d", idCounter++);

        Doctor doctor = new Doctor(id, name, specialization, experience, shift);
        doctorList.add(doctor);

        System.out.println(">> Doctor registered successfully! ID: " + id);
    }

    /**
     * Displays all registered doctors from the ArrayList.
     */
    private static void displayDoctors() {
        if (doctorList.isEmpty()) {
            System.out.println("\n>> No doctors registered yet.");
            return;
        }

        System.out.println("\n============================================================================");
        System.out.println("                      Registered Doctors List");
        System.out.println("============================================================================");

        for (Doctor doctor : doctorList) {
            System.out.println(doctor);
        }

        System.out.println("============================================================================");
        System.out.println("Total Doctors: " + doctorList.size());
    }

    /**
     * Returns the doctor list (for inter-class communication).
     */
    public static ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }
}
