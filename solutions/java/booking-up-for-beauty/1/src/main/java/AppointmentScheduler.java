import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, formatter);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hr = appointmentDate.getHour();
        return hr >= 12 && hr < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
         DateTimeFormatter FORMATTER =
                DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a");
        return "You have an appointment on " + appointmentDate.format(FORMATTER) + ".";
    }

    public LocalDate getAnniversaryDate() {
      LocalDate today = LocalDate.now();
        int year = today.getYear();
        return LocalDate.of(year, 9, 15);
    }
}
