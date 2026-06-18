# UC6: Robust CSV Parsing & Duplicate Handling

**Purpose:** Enhance bulk entry with format sensitivity (skip bad lines) and duplicate data checking (uniqueness check on name + exp + specialization) without relying on heavy external dependencies.

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

"Dr. Smith",INTERNAL_MEDICINE,15,MORNING
Dr. Malathi,GYNAECOLOGIST,10,MORNING
Dr. Invalid,INVALID_SPEC,5,MORNING
Dr. Incomplete,CARDIOLOGIST
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
>> Duplicate found: Dr. Smith (INTERNAL_MEDICINE, 15 yrs). Skipping.
>> Error parsing line: Dr. Invalid,INVALID_SPEC,5,MORNING. Skipping. No enum constant clinicops.Specialization.INVALID_SPEC
>> Invalid data format in line: Dr. Incomplete,CARDIOLOGIST. Skipping.
>> 4 doctors successfully imported!

--- Clinic Admin Menu ---
Enter your choice: 4

============================================================================
                      Registered Doctors List
============================================================================
ID: D0001 | Name: Dr. Smith       | Specialization: INTERNAL_MEDICINE  | Exp: 15 yrs | Shift: MORNING
ID: D0002 | Name: Dr. Alice       | Specialization: CHILD_SPECIALIST   | Exp: 12 yrs | Shift: BOTH
ID: D0003 | Name: Dr. Bob         | Specialization: ENDOCRINOLOGIST    | Exp:  8 yrs | Shift: EVENING
ID: D0004 | Name: Dr. Malathi     | Specialization: GYNAECOLOGIST      | Exp: 10 yrs | Shift: MORNING
============================================================================
Total Doctors: 4

Thank you for using ClinicOps. Goodbye!
```
