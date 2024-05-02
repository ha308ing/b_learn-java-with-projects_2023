package notes;

import java.util.Scanner;

public class AgeCheckDoWhile {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        int age = 0;
        final int ALLOWED_AGE = 13;

        do {
            System.out.print("Please enter your age: ");
            age = scanner.nextInt();
        } while (age < ALLOWED_AGE);

        System.out.format("As you're (%d) older than %d you can get a driver license%n", age, ALLOWED_AGE);

        scanner.close();

    }
}
