package exercises.ch4ConditionalStatements;

import java.time.LocalTime;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import Park.Park;

public class CheckOpenStatus {
    public static void main(String... args) {

        Park park = new Park("Mezoic Park", "10:00", "22:00", 3400, 65);

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);

        String timeString = null;
        String isCurrentTime = "";
        LocalTime openingHours = park.getOpeningHours();
        LocalTime closingHours = park.getClosingHours();
        Pattern timePattern = Pattern.compile("(2[0-3]|[01][0-9]):[0-5][0-9]");

        while (!isCurrentTime.equals("y") &&
                !isCurrentTime.equals("n")) {
            System.out.print("Use current time? (y/n): ");
            isCurrentTime = scanner.next();
        }

        while (isCurrentTime.equals("n") &&
                timeString == null) {

            System.out.print("Enter time: ");

            if (scanner.hasNext(timePattern)) {
                timeString = scanner.next();
            } else {
                System.out.println("Wrong time input");
                scanner.next();
                timeString = null;
            }
        }

        LocalTime time = timeString != null ? LocalTime.parse(timeString) : LocalTime.now();

        formatter.format("time %1$tH:%<tM is", time);

        if (park.isOpen(time)) {
            formatter.format(" within ");
        } else {
            formatter.format(" out of ");
        }

        formatter.format("operating hours %tR - %tR", openingHours, closingHours);

        System.out.println(formatter);
        scanner.close();
    }
}
