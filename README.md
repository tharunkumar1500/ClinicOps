# UC8: Patient Duplicate Check

**Purpose:** Prevent duplicate patient registration by using the mobile number as a unique constraint. Checks if the mobile number exists before prompting for other details.

## Sample Input:
```
2               (Front Desk Executive)
1               (Register Patient)
9876543210      (Mobile Number)
John Doe        (Name)
M               (Gender)
30              (Age)
1               (Register Patient)
9876543210      (Duplicate Mobile Number)
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
  Enter Mobile Number (10 digits): 9876543210
  Enter Patient Name: John Doe
  Enter Gender (M/F/O): M
  Enter Age: 30
>> Patient registered successfully! ID: P0001

--- Front Desk Executive Menu ---
Enter your choice: 1

--- Register New Patient ---
  Enter Mobile Number (10 digits): 9876543210
>> RECORD FOUND: This patient is already registered.
   Details: Patient ID: P0001 | Name: John Doe        | Gender: M      | Age:  30 | Mobile: 9876543210
>> Registration cancelled to avoid duplication.

--- Front Desk Executive Menu ---
Enter your choice: 2

============================================================================
                      Registered Patients List
============================================================================
Patient ID: P0001 | Name: John Doe        | Gender: M      | Age:  30 | Mobile: 9876543210
============================================================================
Total Patients: 1

Thank you for using ClinicOps. Goodbye!
```
