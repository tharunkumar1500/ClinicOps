package clinicops;

/**
 * UC4: Doctor class with Enum fields for Specialization and Shift.
 */
public class Doctor {

    private String id;
    private String name;
    private Specialization specialization;
    private int experience;
    private Shift shift;

    public Doctor(String id, String name, Specialization specialization, int experience, Shift shift) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.shift = shift;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Specialization getSpecialization() { return specialization; }
    public int getExperience() { return experience; }
    public Shift getShift() { return shift; }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %-15s | Specialization: %-18s | Exp: %2d yrs | Shift: %s",
                id, name, specialization, experience, shift);
    }
}
