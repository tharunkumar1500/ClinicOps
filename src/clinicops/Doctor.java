package clinicops;

/**
 * ============================================================================
 * MODEL CLASS - Doctor
 * ============================================================================
 *
 * UC3: Blueprint class for Doctor data.
 * Encapsulates id, name, specialization, experience, and shift.
 *
 * @author Developer
 * @version 3.0
 */
public class Doctor {

    private String id;
    private String name;
    private String specialization;
    private int experience;
    private String shift;

    /**
     * Constructor to initialize all fields.
     */
    public Doctor(String id, String name, String specialization, int experience, String shift) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.shift = shift;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    public int getExperience() { return experience; }
    public String getShift() { return shift; }

    /**
     * Custom formatted toString for display.
     */
    @Override
    public String toString() {
        return String.format("ID: %s | Name: %-15s | Specialization: %-12s | Exp: %2d yrs | Shift: %s",
                id, name, specialization, experience, shift);
    }
}
