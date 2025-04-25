import java.text.*;
import java.util.*;

public class DateClasss {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY E H:m a");
        System.out.println(format.format(date));
        System.out.println(date.getTime());
        System.out.println(date.getDate());
        System.out.println(date.getSeconds());
        System.out.println(date.getYear());

    }
}
