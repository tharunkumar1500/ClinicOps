# ClinicOps - TownClinic Management System

A console-based Java application that manages the patient visit lifecycle from registration to appointment completion.

## Use Cases Implemented

1. **UC1:** Console Based Menu (Switch-Case, RBAC, Modular Architecture)

## Project Structure
```
src/clinicops/
├── ClinicApp.java       (Main entry point)
├── ScannerHelper.java   (Input utility helper)
├── AdminMenu.java       (Clinic Admin menu)
└── FrontDeskMenu.java   (Front Desk Executive menu)
```

## Sample Input & Output

### Sample Input:
```
1
1
4
2
1
3
3
```

### Sample Output:
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
4. Logout
Enter your choice: >> [Placeholder] Doctor's Entry - To be implemented.

--- Clinic Admin Menu ---
1. Doctor's Entry
2. Bulk Entry
3. Audit
4. Logout
Enter your choice: >> Logging out from Admin...

--- Select Your Role ---
1. Clinic Admin
2. Front Desk Executive
3. Exit
Enter your choice:

--- Front Desk Executive Menu ---
1. Register Patient
2. Book Appointment
3. Logout
Enter your choice: >> [Placeholder] Register Patient - To be implemented.

--- Front Desk Executive Menu ---
1. Register Patient
2. Book Appointment
3. Logout
Enter your choice: >> Logging out from Front Desk...

--- Select Your Role ---
1. Clinic Admin
2. Front Desk Executive
3. Exit
Enter your choice:

Thank you for using ClinicOps. Goodbye!
```
