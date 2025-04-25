import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeClasss {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();

        

        DateTimeFormatter format=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(time.format(format));

    }
}