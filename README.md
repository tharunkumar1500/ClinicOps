# UC2: Doctors' Data in the System

**Purpose:** Enter doctors' details with input validation using static class-level variables.

## Project Structure
```
src/clinicops/
├── ClinicApp.java       (Main entry point)
├── ScannerHelper.java   (Input utility - added readIntWithPrompt)
├── AdminMenu.java       (Doctor registration & display - static arrays)
└── FrontDeskMenu.java   (Front Desk Executive menu)
```

## Sample Input:
```
1
1
Dr. Ravi
Cardiology
10
Dr. Meena
Neurology
8
Dr. Arjun
Orthopedics
5
4
5
3
```

## Sample Output:
```
============================================================================
        Welcome to TownClinic - ClinicOps Management System
============================================================================

--- Select Your Role ---
1. Clinic Admin
2. Front Desk Executive
3. Exit
Enter your choice:

--- Clinic Admin Menu ---
1. Doctor's Entry
2. Bulk Entry
3. Audit
4. Display Doctor's List
5. Logout
Enter your choice:

--- Register Doctors (Enter 3 Doctors) ---

Doctor 1:
  Enter Name: Dr. Ravi
  Enter Specialization: Cardiology
  Enter Experience (years): 10

Doctor 2:
  Enter Name: Dr. Meena
  Enter Specialization: Neurology
  Enter Experience (years): 8

Doctor 3:
  Enter Name: Dr. Arjun
  Enter Specialization: Orthopedics
  Enter Experience (years): 5

>> 3 Doctors registered successfully!

--- Clinic Admin Menu ---
1. Doctor's Entry
2. Bulk Entry
3. Audit
4. Display Doctor's List
5. Logout
Enter your choice:

============================================================================
                      Registered Doctors List
============================================================================
No.   | Name                 | Specialization       | Exp (yrs)
----------------------------------------------------------------------------
1     | Dr. Ravi             | Cardiology           | 10
2     | Dr. Meena            | Neurology            | 8
3     | Dr. Arjun            | Orthopedics          | 5
============================================================================

--- Clinic Admin Menu ---
Enter your choice: >> Logging out from Admin...

--- Select Your Role ---
Enter your choice:

Thank you for using ClinicOps. Goodbye!
```
