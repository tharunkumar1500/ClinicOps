package clinicops;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ============================================================================
 * MENU CLASS - FrontDeskMenu
 * ============================================================================
 *
 * UC7: Handles Front Desk Executive menu options.
 * Options: Register Patient, View Patients, Book Appointment, Logout.
 *
 * @author Developer
 * @version 7.0
 */
public class FrontDeskMenu {

    private static ArrayList<Patient> patientList = new ArrayList<>();
    private static int patientIdCounter = 1;

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
                    registerPatient(scanner);
                    break;
                case 2:
                    viewPatients();
                    break;
                case 3:
                    bookAppointment(scanner);
                    break;
                case 4:
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
        System.out.println("2. View Patients");
        System.out.println("3. Book Appointment");
        System.out.println("4. Logout");
        System.out.print("Enter your choice: ");
    }

    /**
     * Registers a new patient.
     */
    private static void registerPatient(Scanner scanner) {
        System.out.println("\n--- Register New Patient ---");

        String mobileNumber = ScannerHelper.readMobileNumber(scanner, "  Enter Mobile Number (10 digits): ");
        
        Patient existingPatient = findPatientByMobile(mobileNumber);
        if (existingPatient != null) {
            System.out.println(">> RECORD FOUND: This patient is already registered.");
            System.out.println("   Details: " + existingPatient);
            System.out.println(">> Registration cancelled to avoid duplication.");
            return;
        }

        String name = ScannerHelper.readNonEmptyString(scanner, "  Enter Patient Name: ");
        String gender = ScannerHelper.readNonEmptyString(scanner, "  Enter Gender (M/F/O): ");
        int age = ScannerHelper.readIntWithPrompt(scanner, "  Enter Age: ");

        String id = String.format("P%04d", patientIdCounter++);
        Patient patient = new Patient(id, name, gender, age, mobileNumber);
        
        patientList.add(patient);
        System.out.println(">> Patient registered successfully! ID: " + id);
    }

    /**
     * Finds a patient by their mobile number.
     * @return Patient object if found, null otherwise.
     */
    private static Patient findPatientByMobile(String mobile) {
        for (Patient patient : patientList) {
            if (patient.getMobileNumber().equals(mobile)) {
                return patient;
            }
        }
        return null;
    }

    /**
     * Displays all registered patients.
     */
    private static void viewPatients() {
        if (patientList.isEmpty()) {
            System.out.println("\n>> No patients registered yet.");
            return;
        }

        System.out.println("\n============================================================================");
        System.out.println("                      Registered Patients List");
        System.out.println("============================================================================");

        for (Patient patient : patientList) {
            System.out.println(patient);
        }

        System.out.println("============================================================================");
        System.out.println("Total Patients: " + patientList.size());
    }

    /**
     * Books an appointment for a registered patient.
     */
    private static void bookAppointment(Scanner scanner) {
        System.out.println("\n--- Book Appointment ---");
        String mobile = ScannerHelper.readMobileNumber(scanner, "  Enter Patient Mobile Number: ");
        Patient patient = findPatientByMobile(mobile);

        if (patient == null) {
            System.out.println(">> Patient not found! Please register the patient first.");
            return;
        }

        String selectedSlot = ScannerHelper.selectSlotFromList(scanner);
        ArrayList<Doctor> allDoctors = AdminMenu.getDoctorList();
        
        if (allDoctors.isEmpty()) {
            System.out.println(">> No doctors available in the system.");
            return;
        }

        ArrayList<Doctor> availableDoctors = new ArrayList<>();
        for (Doctor doctor : allDoctors) {
            if (doctor.isSlotAvailable(selectedSlot)) {
                availableDoctors.add(doctor);
            }
        }

        if (availableDoctors.isEmpty()) {
            System.out.println(">> No doctors are available for the selected slot (" + selectedSlot + ").");
        } else {
            // Select a random available doctor
            java.util.Random rand = new java.util.Random();
            Doctor assignedDoctor = availableDoctors.get(rand.nextInt(availableDoctors.size()));
            
            assignedDoctor.bookSlot(selectedSlot);
            Appointment appointment = new Appointment(patient, assignedDoctor, selectedSlot);
            
            System.out.println("\n>> Appointment Booked Successfully!");
            System.out.println("   " + appointment);
        }
    }
}
