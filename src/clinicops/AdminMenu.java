package clinicops;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * UC4: AdminMenu using Enums for Specialization and Shift input.
 */
public class AdminMenu {

    private static ArrayList<Doctor> doctorList = new ArrayList<>();
    private static int idCounter = 1;

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
                    handleBulkEntry(scanner);
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

    private static void displayAdminOptions() {
        System.out.println("\n--- Clinic Admin Menu ---");
        System.out.println("1. Doctor's Entry");
        System.out.println("2. Bulk Entry");
        System.out.println("3. Audit");
        System.out.println("4. Display Doctor's List");
        System.out.println("5. Logout");
        System.out.print("Enter your choice: ");
    }

    private static void registerDoctors(Scanner scanner) {
        System.out.println("\n--- Register Doctor ---");

        String name = ScannerHelper.readNonEmptyString(scanner, "  Enter Name: ");

        System.out.println("\n  Select Specialization:");
        Specialization specialization = ScannerHelper.readEnumChoice(scanner, Specialization.values());

        int experience = ScannerHelper.readIntWithPrompt(scanner, "  Enter Experience (years): ");

        System.out.println("\n  Select Shift:");
        Shift shift = ScannerHelper.readEnumChoice(scanner, Shift.values());

        String id = String.format("D%04d", idCounter++);

        Doctor doctor = new Doctor(id, name, specialization, experience, shift);
        doctorList.add(doctor);

        System.out.println(">> Doctor registered successfully! ID: " + id);
    }

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

    public static ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    private static void handleBulkEntry(Scanner scanner) {
        System.out.println("\n--- Bulk Entry (Doctors) ---");
        String filePath = ScannerHelper.readNonEmptyString(scanner, "  Enter the CSV file path: ");
        
        ArrayList<Doctor> newDoctors = FileHandler.loadDoctorsFromCsv(filePath, idCounter, doctorList);
        
        if (!newDoctors.isEmpty()) {
            doctorList.addAll(newDoctors);
            idCounter += newDoctors.size();
            System.out.println(">> " + newDoctors.size() + " doctors successfully imported!");
        } else {
            System.out.println(">> No valid doctors imported from the file.");
        }
    }
}
