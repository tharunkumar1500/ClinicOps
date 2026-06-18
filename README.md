# UC4: Fixed Values Using Enums

**Purpose:** Prevent user typos by using Enums for Shift and Specialization with menu selection.

## New Files
- `Shift.java` - Enum: MORNING, EVENING, BOTH
- `Specialization.java` - Enum: GENERAL_PHYSICIAN, INTERNAL_MEDICINE, ENDOCRINOLOGIST, CARDIOLOGIST, CHILD_SPECIALIST, GYNAECOLOGIST

## Sample Input:
```
1
1
Dr. Ravi
4       (selects CARDIOLOGIST)
10
3       (selects BOTH)
4       (Display Doctors)
5       (Logout)
3       (Exit)
```

## Sample Output:
```
============================================================================
        Welcome to TownClinic - ClinicOps Management System
============================================================================

--- Clinic Admin Menu ---
Enter your choice:

--- Register Doctor ---
  Enter Name: Dr. Ravi

  Select Specialization:
  Select from the following:
    1. GENERAL_PHYSICIAN
    2. INTERNAL_MEDICINE
    3. ENDOCRINOLOGIST
    4. CARDIOLOGIST
    5. CHILD_SPECIALIST
    6. GYNAECOLOGIST
  Enter choice: 4
  Enter Experience (years): 10

  Select Shift:
  Select from the following:
    1. MORNING
    2. EVENING
    3. BOTH
  Enter choice: 3
>> Doctor registered successfully! ID: D0001

============================================================================
                      Registered Doctors List
============================================================================
ID: D0001 | Name: Dr. Ravi        | Specialization: CARDIOLOGIST       | Exp: 10 yrs | Shift: BOTH
============================================================================
Total Doctors: 1

Thank you for using ClinicOps. Goodbye!
```
