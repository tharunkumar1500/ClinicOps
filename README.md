# ClinicOps

ClinicOps is a console-based application for a small clinic named "TownClinic". It manages the lifecycle of a patient visit, from registration to appointment completion, replacing paper-based records with a robust digital system.

## Supported Features (Use Cases)

### UC1: Console Based Menu
- **Purpose:** Implements a menu-driven interface with Persona-Based Authorization. Users can select between `Clinic Admin` and `Front Desk Executive` roles to access relevant features.
- **Concepts:** `switch-case`, Role-Based Access Control, Modularization.

### UC2 & UC3: Doctor Data Entry & Object-Oriented Refactoring
- **Purpose:** Allows the Clinic Admin to register doctors manually with details like Name, Specialization, Experience, and Shift. Generates unique IDs like `D0001` automatically.
- **Concepts:** Encapsulation (Doctor Class), Constructors, ArrayList operations.

### UC4: Enums for Fixed Values
- **Purpose:** Uses fixed Enumerations for `Specialization` and `Shift` to prevent data entry typos.
- **Concepts:** Enums (`Specialization.java`, `Shift.java`), Generics in Menu input handling.

### UC5 & UC6: Bulk Data Entry for Doctors
- **Purpose:** Allows the Admin to import doctor records from a CSV file (`doctors.csv`).
- **Concepts:** File I/O (`BufferedReader`, `.split()`), Exception handling, Validation (duplicate checking based on Name, Specialization, and Experience).

### UC7: Register Patient Data
- **Purpose:** Allows the Front Desk Executive to register new patients. Automatically generates unique IDs like `P0001`.
- **Concepts:** Regex for Indian Mobile Number Validation.

### UC8: Check Existing Patient
- **Purpose:** Prompts for mobile number *first* during registration to verify if the patient already exists, preventing duplicate entries.
- **Concepts:** Linear search, Encapsulation, "null" value for search status.

### UC9, UC10, UC11: Appointment Booking (Shift & Specialization Aware)
- **Purpose:** Front Desk Executive can book appointments for patients based on preferred 30-minute slots. The system randomly assigns a doctor who matches the requested specialization, works the appropriate shift, and is available at the requested slot.
- **Concepts:** Object Composition, Random assignment, Java Stream API (`.filter()`, `.findFirst()`), Stateful classes (`bookedSlots`).

### UC12, UC13, UC14: Audit Logging System
- **Purpose:** Implements a central `AuditLogger` to record all successful transactions (Functional Logging), invalid data attempts (Security Logging), and CSV parse errors (Error Logging).
- **Concepts:** Logging, Time API (`LocalDateTime`), Event-driven tracing.

---

## Sample Execution & Output

### 1. Bulk Import and Doctor View
```text
--- Clinic Admin Menu ---
1. Doctor's Entry
2. Bulk Entry
...
Enter your choice: 2

--- Bulk Entry (Doctors) ---
  Enter the CSV file path: doctors.csv
>> 4 doctors successfully imported!
```

### 2. Patient Registration (With Duplicate Check)
```text
--- Register New Patient ---
  Enter Mobile Number (10 digits): invalid
>> Invalid mobile number. Must be 10 digits starting with 6-9. Try again.
  Enter Mobile Number (10 digits): 9876543210
  Enter Patient Name: John Doe
  ...
>> Patient registered successfully! ID: P0001
```

### 3. Booking an Appointment
```text
--- Book Appointment ---
  Enter Patient Mobile Number: 9876543210
  Available Slots:
    1. 09:00 AM
    ...
  Select a slot number: 1
  Select Required Specialization:
    1. GENERAL_PHYSICIAN
    ...
  Enter choice: 5

>> Appointment Booked Successfully!
   Appointment Slot: 09:00 AM | Doctor: Dr. Alice | Patient: John Doe
```

### 4. Viewing Audit Logs
```text
============================================================================
                              Audit Logs
============================================================================
[2026-06-18 16:00:47] [ERROR] CSV Parsing Error in line: 'Dr. Invalid,INVALID_SPEC,5,MORNING' -> No enum constant clinicops.Specialization.INVALID_SPEC
[2026-06-18 16:00:47] [INFO] Bulk uploaded 4 doctors from doctors.csv
[2026-06-18 16:00:47] [WARNING] Invalid mobile number attempt: invalid
[2026-06-18 16:00:47] [INFO] Patient registered: John Doe (ID: P0001)
[2026-06-18 16:00:47] [INFO] Appointment booked for Patient: John Doe with Doctor: Dr. Alice at Slot: 09:00 AM
============================================================================
Total Logs: 5
```

## How to Run

1. Navigate to the project directory.
2. Compile the files:
   ```bash
   javac src/clinicops/*.java
   ```
3. Run the application:
   ```bash
   java -cp src clinicops.ClinicApp
   ```
