# UC12, UC13, UC14: Audit Logging (Functional, Error & Security)

**Purpose:** Provide traceability by logging successful transactions (Functional), recording "silent" errors like CSV upload failures (Error), and tracking invalid attempts like wrong mobile numbers (Security).

## New Files
- `AuditLogger.java` - A custom logger utility class that formats and stores logs with timestamps and log levels.

## Features Added
- **[INFO]**: Logs when doctors are registered (manually or via bulk upload) and when appointments are successfully booked.
- **[WARNING]**: Logs when an invalid mobile number format is entered during patient registration or booking.
- **[ERROR]**: Logs when a CSV parsing error or format mismatch occurs during the bulk upload process.
- **View Audit Logs**: A dedicated admin menu option to display all recorded system logs.

## Sample Output (Audit Logs):
```
--- Clinic Admin Menu ---
Enter your choice: 3

============================================================================
                              Audit Logs
============================================================================
[2026-06-18 16:00:47] [ERROR] CSV Parsing Error in line: 'Dr. Invalid,INVALID_SPEC,5,MORNING' -> No enum constant clinicops.Specialization.INVALID_SPEC
[2026-06-18 16:00:47] [ERROR] CSV Format Error (Invalid number of columns): Dr. Incomplete,CARDIOLOGIST
[2026-06-18 16:00:47] [INFO] Bulk uploaded 4 doctors from doctors.csv
[2026-06-18 16:00:47] [WARNING] Invalid mobile number attempt: invalid
[2026-06-18 16:00:47] [INFO] Patient registered: John Doe (ID: P0001)
[2026-06-18 16:00:47] [INFO] Appointment booked for Patient: John Doe with Doctor: Dr. Alice at Slot: 09:00 AM
============================================================================
Total Logs: 6
```
