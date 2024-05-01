package notes;

import java.util.Scanner;

public class DaysInMonthWithIf {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        final int JAN = 1, FEB = 2, MAR = 3,
                APR = 4, MAY = 5, JUN = 6,
                JUL = 7, AUG = 8, SEP = 9,
                OCT = 10, NOV = 11, DEC = 12;

        int numDays = 0;

        System.out.print("Enter month --> ");

        int month = scanner.nextInt();

        if (month == JAN ||
                month == MAR ||
                month == MAY ||
                month == JUL ||
                month == AUG ||
                month == OCT ||
                month == DEC) {

            numDays = 31;

        } else if (month == APR ||
                month == JUN ||
                month == SEP ||
                month == NOV) {

            numDays = 30;

        } else if (month == FEB) {
            System.out.print("Enter year --> ");
            int year = scanner.nextInt();

            if ((year % 400 == 0) || (year % 4 == 0 && !(year % 100 == 0))) {
                // leap year 2000, 2012, 2016
                numDays = 29;
            } else {
                numDays = 28;
            }

        } else {
            System.out.println("Invalid month: " + month);
        }

        if (numDays > 0) {
            System.out.println("Number of days: " + numDays);
        }

        scanner.close();

    }
}
