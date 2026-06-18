# UC7: Register Patient Data

**Purpose:** Allow the Front Desk Executive to register patients with a mobile number format check and auto-generated unique IDs.

## New Files
- `Patient.java` - Blueprint for patient data.

## Features
- Validates Indian mobile numbers (10 digits starting with 6-9).
- Auto-generates patient IDs (e.g., P0001).

## Sample Input:
```
2               (Front Desk Executive)
1               (Register Patient)
John Doe
M
30
9876543210
1               (Register Patient)
Jane Doe
F
25
invalid_num     (Fails regex check)
8765432109      (Succeeds)
2               (View Patients)
4               (Logout)
3               (Exit)
```

## Sample Output:
```
============================================================================
        Welcome to TownClinic - ClinicOps Management System
============================================================================

--- Front Desk Executive Menu ---
Enter your choice: 1

--- Register New Patient ---
  Enter Patient Name: John Doe
  Enter Gender (M/F/O): M
  Enter Age: 30
  Enter Mobile Number (10 digits): 9876543210
>> Patient registered successfully! ID: P0001

--- Front Desk Executive Menu ---
Enter your choice: 1

--- Register New Patient ---
  Enter Patient Name: Jane Doe
  Enter Gender (M/F/O): F
  Enter Age: 25
  Enter Mobile Number (10 digits): invalid_num
>> Invalid mobile number. Must be 10 digits starting with 6-9. Try again.
  Enter Mobile Number (10 digits): 8765432109
>> Patient registered successfully! ID: P0002

--- Front Desk Executive Menu ---
Enter your choice: 2

============================================================================
                      Registered Patients List
============================================================================
Patient ID: P0001 | Name: John Doe        | Gender: M      | Age:  30 | Mobile: 9876543210
Patient ID: P0002 | Name: Jane Doe        | Gender: F      | Age:  25 | Mobile: 8765432109
============================================================================
Total Patients: 2

Thank you for using ClinicOps. Goodbye!
```
