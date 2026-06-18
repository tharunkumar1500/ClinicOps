# UC10 & UC11: Appointment Filters (Specialization & Shift)

**Purpose:** Enhances the appointment booking process by filtering doctors based on the required specialization and ensuring they are on duty during the selected time slot.

## Features Added
- Specialization Input: Front Desk Executive selects required specialization for the appointment.
- Shift Compatibility: System ensures the chosen time slot falls within the doctor's assigned shift (MORNING, EVENING, or BOTH).
- Slot Availability Check: System ensures the doctor hasn't already been booked for that exact slot.

## Sample Output (Failing Case - Wrong Shift):
```
--- Book Appointment ---
  Enter Patient Mobile Number: 9876543210

  Available Slots:
    1. 09:00 AM ... 
  Select a slot number: 1

  Select Required Specialization:
  Select from the following:
    1. GENERAL_PHYSICIAN ...
    3. ENDOCRINOLOGIST
  Enter choice: 3
>> No doctors are available for ENDOCRINOLOGIST at the selected slot (09:00 AM).
```
*(Dr. Bob is an Endocrinologist but only works the EVENING shift, so 09:00 AM fails).*

## Sample Output (Success Case - Shift & Spec match):
```
--- Book Appointment ---
  Enter Patient Mobile Number: 9876543210

  ...
  Select a slot number: 1

  Select Required Specialization:
  Select from the following:
    1. GENERAL_PHYSICIAN ...
    5. CHILD_SPECIALIST
  Enter choice: 5

>> Appointment Booked Successfully!
   Appointment Slot: 09:00 AM | Doctor: Dr. Alice | Patient: John Doe
```
