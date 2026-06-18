# UC9: Appointment Booking

**Purpose:** Front Desk Executive books an appointment for a registered patient by selecting an available time slot. The system automatically assigns a random doctor who is free during that slot.

## New Files
- `Appointment.java` - Holds the Patient, Doctor, and selected time slot.

## Sample Input:
```
1               (Admin)
2               (Bulk Entry)
doctors.csv     (File path)
5               (Logout)
2               (Front Desk)
1               (Register Patient)
9876543210      (Mobile)
John Doe        (Name)
M               (Gender)
30              (Age)
3               (Book Appointment)
9876543210      (Mobile)
1               (Select Slot: 09:00 AM)
4               (Logout)
3               (Exit)
```

## Sample Output:
```
============================================================================
        Welcome to TownClinic - ClinicOps Management System
============================================================================

--- Front Desk Executive Menu ---
Enter your choice: 3

--- Book Appointment ---
  Enter Patient Mobile Number: 9876543210

  Available Slots:
    1. 09:00 AM
    2. 09:30 AM
    3. 10:00 AM
    4. 10:30 AM
    5. 11:00 AM
    6. 11:30 AM
    7. 12:00 PM
    8. 12:30 PM
    9. 04:00 PM
    10. 04:30 PM
    11. 05:00 PM
    12. 05:30 PM
    13. 06:00 PM
    14. 06:30 PM
    15. 07:00 PM
    16. 07:30 PM
  Select a slot number: 1

>> Appointment Booked Successfully!
   Appointment Slot: 09:00 AM | Doctor: Dr. Bob | Patient: John Doe
```
