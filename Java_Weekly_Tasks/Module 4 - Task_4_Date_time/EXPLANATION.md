# Module 4: Date and Time

## 1. Objective
Practise Java's modern Date and Time API from the `java.time` package to represent, format, compare, and calculate dates and times.

## 2. File in this module

- `Main.java`: Demonstrates the main date and time classes and operations.

## 3. Code explanation

### Import statements
The program imports classes from `java.time` and `java.time.format`:
- `LocalDate`
- `LocalTime`
- `LocalDateTime`
- `Period`
- `Duration`
- `DateTimeFormatter`

### LocalDate
`LocalDate` stores a date without a time or time zone.

```java
LocalDate today = LocalDate.of(2026, 11, 22);
```

The program uses `plusDays()`, `minusDays()`, and `withDayOfMonth()` to calculate another date.

### LocalTime
`LocalTime` stores a time without a date or time zone.

```java
LocalTime startTime = LocalTime.of(9, 30);
```

The program creates start and end times for a sample working day.

### LocalDateTime
`LocalDateTime` stores both a date and a time, but does not include a time zone.

```java
LocalDateTime meeting =
        LocalDateTime.of(2026, 11, 25, 14, 30);
```

### DateTimeFormatter
`DateTimeFormatter` controls how dates and times are displayed.

For example, the pattern `dd-MM-yyyy` displays a date as day-month-year, while `hh:mm a` displays time in 12-hour format with AM or PM.

### Period
`Period.between(joiningDate, today)` calculates the date-based difference between two dates in years, months, and days.

### Duration
`Duration.between(startTime, endTime)` calculates the time-based difference between two times. The program displays the difference in hours and remaining minutes.

### Current date and time
`LocalDate.now()`, `LocalTime.now()`, and `LocalDateTime.now()` retrieve the current date, time, and date-time from the computer's system clock.

## 4. Important Java concepts

| Class / method | Purpose |
|---|---|
| `LocalDate` | Represents a date |
| `LocalTime` | Represents a time |
| `LocalDateTime` | Represents a date and time |
| `DateTimeFormatter` | Formats date and time output |
| `Period` | Calculates date-based differences |
| `Duration` | Calculates time-based differences |
| `plusDays()` | Adds days to a date |
| `minusDays()` | Subtracts days from a date |
| `now()` | Gets the current system date or time |

## 5. Sample output summary

The program uses fixed sample values for predictable demonstration:
- Sample date: 22-11-2026
- Start time: 09:30 AM
- End time: 05:45 PM
- Working-time difference: 8 hours and 15 minutes
- Meeting: 25 Nov 2026, 02:30 PM

It also displays the date after one day, the date seven days earlier, the last day of the month, and the period since the sample joining date.

The final section displays the actual current date and time from the computer running the program.

## 6. How to compile and run

Run this command from this module's `src` directory:

```bash
javac Main.java
java Main
```

## 7. How to explain this task to the trainer

"I used Java's java.time package to work with dates and times. LocalDate represents only a date, LocalTime represents only a time, and LocalDateTime represents both. I used DateTimeFormatter to display them in readable formats. Period calculates the difference between two dates, while Duration calculates the difference between two times. I also demonstrated date calculations and methods to retrieve the current system date and time."

## 8. Key takeaway
The `java.time` API provides clear and reliable classes for date and time operations. Different classes are used depending on whether the program needs a date, a time, both, or a difference between values.

## 9. Note about the sample values
Fixed sample dates and times make the demonstration output predictable. The `now()` methods are included separately to show how to retrieve live values from the system clock.
