package Important;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class UtilityDemo {
    public static void main(String[] args) {
        Object object = new Object();

        //format yy-mm-dd
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        //extragere luna
        System.out.println("The month is: " + LocalDate.now().getMonth());
        System.out.println("This is a leap year: " + LocalDate.now().isLeapYear());
        System.out.println("The day of the week is: " + LocalDate.now().getDayOfWeek());

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("The time now is: " + localDateTimeNow);
        System.out.println("The time now is: " + localDateTimeNow.atZone(ZoneId.systemDefault()));

        System.out.println("Before formating: " + localDateTimeNow);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = localDateTimeNow.format(format);
        System.out.println("After formating: " + formatDateTime);

        Timestamp timestamp = Timestamp.from(Instant.now());
        System.out.println("Timestamp now: " + timestamp);

        Random random = new Random();
        int intRandom = random.nextInt(-10000, 10000);
        boolean booleanRandom = random.nextBoolean();
        System.out.println(intRandom);
        System.out.println(booleanRandom);

        double sqrtNo = 25;
        double sqrtExtract = Math.sqrt(25);
        System.out.println("The sqrt no from: " + sqrtNo + "is " + sqrtExtract);

        double powNo = 9.0;
        int raised = 3;
        double powExtract = Math.sqrt(powNo);
        System.out.println("The pow number from: " + powNo + "raised with " + raised + "is " + powExtract);


    }
}
