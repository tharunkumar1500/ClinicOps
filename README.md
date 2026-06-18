# UC3: Refactored Doctor Data with OOP

**Purpose:** Refactor UC2 to use Doctor class, ArrayList, and auto-generated IDs.

## Project Structure
```
src/clinicops/
├── ClinicApp.java       (Main entry point)
├── ScannerHelper.java   (Input utility helper)
├── AdminMenu.java       (Refactored with ArrayList<Doctor>)
├── Doctor.java          [NEW] (Blueprint class with toString)
└── FrontDeskMenu.java   (Front Desk Executive menu)
```

## Sample Input:
```
1
1
Dr. Ravi
Cardiology
10
Morning
1
Dr. Meena
Neurology
8
Evening
1
Dr. Arjun
Orthopedics
5
Both
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
Enter your choice:

--- Clinic Admin Menu ---
Enter your choice:

--- Register Doctor ---
  Enter Name: Dr. Ravi
  Enter Specialization: Cardiology
  Enter Experience (years): 10
  Enter Shift (Morning/Evening/Both): Morning
>> Doctor registered successfully! ID: D0001

  Enter Name: Dr. Meena
  Enter Specialization: Neurology
  Enter Experience (years): 8
  Enter Shift (Morning/Evening/Both): Evening
>> Doctor registered successfully! ID: D0002

  Enter Name: Dr. Arjun
  Enter Specialization: Orthopedics
  Enter Experience (years): 5
  Enter Shift (Morning/Evening/Both): Both
>> Doctor registered successfully! ID: D0003

--- Clinic Admin Menu ---
Enter your choice: 4

============================================================================
                      Registered Doctors List
============================================================================
ID: D0001 | Name: Dr. Ravi        | Specialization: Cardiology   | Exp: 10 yrs | Shift: Morning
ID: D0002 | Name: Dr. Meena       | Specialization: Neurology    | Exp:  8 yrs | Shift: Evening
ID: D0003 | Name: Dr. Arjun       | Specialization: Orthopedics  | Exp:  5 yrs | Shift: Both
============================================================================
Total Doctors: 3

>> Logging out from Admin...
Thank you for using ClinicOps. Goodbye!
```
