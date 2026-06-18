package clinicops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * ============================================================================
 * UTILITY CLASS - FileHandler
 * ============================================================================
 *
 * UC5: Handles bulk data entry of doctors from a CSV file.
 */
public class FileHandler {

    /**
     * Reads a CSV file and returns a list of Doctor objects.
     * Format expected: Name,Specialization,Experience,Shift
     * 
     * @param filePath The path to the CSV file.
     * @param startId The starting ID counter for assigning IDs.
     * @return An ArrayList of Doctor objects parsed from the file.
     */
    public static ArrayList<Doctor> loadDoctorsFromCsv(String filePath, int startId) {
        ArrayList<Doctor> newDoctors = new ArrayList<>();
        int currentId = startId;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                // Skip header line if present
                if (isFirstLine) {
                    isFirstLine = false;
                    if (line.toLowerCase().contains("name")) {
                        continue;
                    }
                }

                String[] data = line.split(",");
                if (data.length == 4) {
                    try {
                        String name = data[0].trim();
                        Specialization specialization = Specialization.valueOf(data[1].trim().toUpperCase());
                        int experience = Integer.parseInt(data[2].trim());
                        Shift shift = Shift.valueOf(data[3].trim().toUpperCase());

                        String id = String.format("D%04d", currentId++);
                        Doctor doctor = new Doctor(id, name, specialization, experience, shift);
                        newDoctors.add(doctor);
                    } catch (IllegalArgumentException e) {
                        System.out.println(">> Error parsing line: " + line + ". Skipping. " + e.getMessage());
                    }
                } else {
                    System.out.println(">> Invalid data format in line: " + line + ". Skipping.");
                }
            }
        } catch (IOException e) {
            System.out.println(">> Error reading file: " + e.getMessage());
        }

        return newDoctors;
    }
}
