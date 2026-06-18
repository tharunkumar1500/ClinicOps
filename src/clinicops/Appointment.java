package clinicops;

/**
 * ============================================================================
 * MODEL CLASS - Appointment
 * ============================================================================
 *
 * UC9: Represents an appointment booking holding Patient, Doctor, and time slot.
 */
public class Appointment {

    private Patient patient;
    private Doctor doctor;
    private String slot;

    public Appointment(Patient patient, Doctor doctor, String slot) {
        this.patient = patient;
        this.doctor = doctor;
        this.slot = slot;
    }

    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public String getSlot() { return slot; }

    @Override
    public String toString() {
        return String.format("Appointment Slot: %s | Doctor: %s | Patient: %s",
                slot, doctor.getName(), patient.getName());
    }
}
