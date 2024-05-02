package notes;

import java.util.Scanner;

/**
 * SumWhileNotNegative (while loop)
 * 
 * demo of the while loop with unknown number of iterations
 * 
 */
public class SumWhileNotNegative {

    public static void main(String... args) {

        int sum = 0, n = 0;

        Scanner scanner = new Scanner(System.in);

        boolean continueLoop = true;

        while (continueLoop) {
            System.out.print("Enter negative to stop: ");
            n = scanner.nextInt();

            if (n < 0) {
                continueLoop = false;
            } else {
                sum += n;
            }
        }

        System.out.println("Sum: " + sum);

        scanner.close();

    }
}
