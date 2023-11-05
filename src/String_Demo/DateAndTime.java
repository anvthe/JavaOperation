package String_Demo;

import javax.swing.text.DateFormatter;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {

        Date date = new Date();
        LocalTime time = LocalTime.now();

        DateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
        //DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String currentDate = dateFormatter.format(date);
        System.out.println("Today : "+currentDate);

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formatedtime = time.format(timeFormatter);
        System.out.println("Time : "+formatedtime);


    }
}
