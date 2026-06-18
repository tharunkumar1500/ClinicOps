# UC5: Bulk Data Entry for Doctors

**Purpose:** Import doctor details from a CSV file, validate against Enums, and update the list.

## New Files
- `FileHandler.java` - Utility class to read CSV and parse data.
- `doctors.csv` - Sample CSV file for bulk import.

## Sample Input:
```
1               (Admin)
2               (Bulk Entry)
doctors.csv     (File path)
4               (Display)
5               (Logout)
3               (Exit)
```

## Sample CSV (`doctors.csv`):
```csv
Name,Specialization,Experience,Shift
Dr. Smith,INTERNAL_MEDICINE,15,MORNING
Dr. Alice,CHILD_SPECIALIST,12,BOTH
Dr. Bob,ENDOCRINOLOGIST,8,EVENING
```

## Sample Output:
```
============================================================================
        Welcome to TownClinic - ClinicOps Management System
============================================================================

--- Clinic Admin Menu ---
Enter your choice: 2

--- Bulk Entry (Doctors) ---
  Enter the CSV file path: doctors.csv
>> 3 doctors successfully imported!

--- Clinic Admin Menu ---
Enter your choice: 4

============================================================================
                      Registered Doctors List
============================================================================
ID: D0001 | Name: Dr. Smith       | Specialization: INTERNAL_MEDICINE  | Exp: 15 yrs | Shift: MORNING
ID: D0002 | Name: Dr. Alice       | Specialization: CHILD_SPECIALIST   | Exp: 12 yrs | Shift: BOTH
ID: D0003 | Name: Dr. Bob         | Specialization: ENDOCRINOLOGIST    | Exp:  8 yrs | Shift: EVENING
============================================================================
Total Doctors: 3

Thank you for using ClinicOps. Goodbye!
```
