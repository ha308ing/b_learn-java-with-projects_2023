// 3. a leap year checker

package exercises.ch3OperatorsAndCasting;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d{4}");

        int year = 0;
        boolean isInputValid = false;

        while (!isInputValid) {
            System.out.println("Enter a year: ");
            isInputValid = scanner.hasNext(pattern);
            if (isInputValid)
                year = scanner.nextInt();
            else
                scanner.next();
        }

        scanner.close();
        boolean isLeap = isLeapYear(year);

        System.out.println(year + (isLeap ? " is " : " is not ") + "leap");
    }

    static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}
