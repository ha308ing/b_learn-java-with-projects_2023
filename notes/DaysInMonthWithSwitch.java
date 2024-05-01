package notes;

import java.util.Scanner;

public class DaysInMonthWithSwitch {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        final int JAN = 1, FEB = 2, MAR = 3,
                APR = 4, MAY = 5, JUN = 6,
                JUL = 7, AUG = 8, SEP = 9,
                OCT = 10, NOV = 11, DEC = 12;

        int numDays = 0;

        System.out.print("Enter month --> ");

        int month = scanner.nextInt();

        switch (month) {
            case JAN:
            case MAR:
            case MAY:
            case JUL:
            case AUG:
            case OCT:
            case DEC:
                numDays = 31;
                break;
            case APR:
            case JUN:
            case SEP:
            case NOV:
                numDays = 30;
                break;
            case FEB:
                System.out.print("Enter year --> ");
                int year = scanner.nextInt();

                if ((year % 400 == 0) || (year % 4 == 0 && !(year % 100 == 0))) {
                    // leap year 2000, 2012, 2016
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid month: " + month);
        }

        if (numDays > 0) {
            System.out.println("Number of days: " + numDays);
        }

        scanner.close();

    }
}
