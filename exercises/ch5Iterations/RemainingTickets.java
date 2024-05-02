//  a while loop that simulates the park’s ticket-selling process until tickets are sold out

package exercises.ch5Iterations;

public class RemainingTickets {
    public static void main(String... args) {
        int totalTickets = 6000;
        final int TICKETS_BATCH = 1000;

        while (totalTickets > 0) {
            totalTickets -= TICKETS_BATCH;
            System.out.format("sell %d ticket, %d remaining%n", TICKETS_BATCH, totalTickets);
        }

        System.out.println("all tickets have been sold!");

    }
}
