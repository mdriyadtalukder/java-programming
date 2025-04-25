import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalDates {
    public static void main(String[] args) {
        LocalDate day = LocalDate.of(2024, 02, 19);
        System.out.println(day.getDayOfWeek().name());

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter f=DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(dt.format(f));




    }
}
