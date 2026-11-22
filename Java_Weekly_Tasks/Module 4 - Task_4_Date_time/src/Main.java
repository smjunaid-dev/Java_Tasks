import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // LocalDate represents a date without a time.
        LocalDate today = LocalDate.of(2026, 11, 22);
        LocalDate joiningDate = LocalDate.of(2025, 7, 1);

        // LocalTime represents a time without a date.
        LocalTime startTime = LocalTime.of(9, 30);
        LocalTime endTime = LocalTime.of(17, 45);

        // LocalDateTime represents both date and time.
        LocalDateTime meeting = LocalDateTime.of(2026, 11, 25, 14, 30);

        DateTimeFormatter dateFormat =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFormat =
                DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter dateTimeFormat =
                DateTimeFormatter.ofPattern("dd MMM yyyy, hh:mm a");

        System.out.println("===== JAVA DATE AND TIME =====");
        System.out.println("Sample date: " + today.format(dateFormat));
        System.out.println("Start time: " + startTime.format(timeFormat));
        System.out.println("End time: " + endTime.format(timeFormat));
        System.out.println("Meeting: " + meeting.format(dateTimeFormat));

        System.out.println("\n===== DATE OPERATIONS =====");
        System.out.println("Tomorrow: " +
                today.plusDays(1).format(dateFormat));
        System.out.println("Seven days earlier: " +
                today.minusDays(7).format(dateFormat));
        System.out.println("Last day of this month: " +
                today.withDayOfMonth(today.lengthOfMonth()).format(dateFormat));

        Period experience = Period.between(joiningDate, today);
        System.out.println("Period since joining date: "
                + experience.getYears() + " years, "
                + experience.getMonths() + " months, "
                + experience.getDays() + " days");

        System.out.println("\n===== TIME DIFFERENCE =====");
        Duration workingHours = Duration.between(startTime, endTime);
        System.out.println("Time difference: "
                + workingHours.toHours() + " hours and "
                + (workingHours.toMinutes() % 60) + " minutes");

        System.out.println("\n===== CURRENT SYSTEM DATE AND TIME =====");
        System.out.println("Current date: " +
                LocalDate.now().format(dateFormat));
        System.out.println("Current time: " +
                LocalTime.now().format(timeFormat));
        System.out.println("Current date and time: " +
                LocalDateTime.now().format(dateTimeFormat));
    }
}
