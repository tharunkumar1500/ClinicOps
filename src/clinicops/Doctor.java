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
    private java.util.ArrayList<String> bookedSlots = new java.util.ArrayList<>();

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

    public boolean isSlotAvailable(String slot) {
        return !bookedSlots.contains(slot);
    }

    public boolean isSlotInShift(String slot) {
        boolean isMorningSlot = slot.contains("AM") || slot.equals("12:00 PM") || slot.equals("12:30 PM");
        if (shift == Shift.BOTH) return true;
        if (shift == Shift.MORNING) return isMorningSlot;
        if (shift == Shift.EVENING) return !isMorningSlot;
        return false;
    }

    public void bookSlot(String slot) {
        bookedSlots.add(slot);
    }

    public java.util.ArrayList<String> getBookedSlots() {
        return bookedSlots;
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %-15s | Specialization: %-18s | Exp: %2d yrs | Shift: %s",
                id, name, specialization, experience, shift);
    }
}
