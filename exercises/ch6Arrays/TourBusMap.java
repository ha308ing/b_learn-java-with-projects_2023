// use nested loops to print out a seating chart for a park tour bus from a two-dimensional array

package exercises.ch6Arrays;

public class TourBusMap {

    static int numberOfFreeSeats = 0;

    public static void main(String... args) {

        int[][] seats = {
                { 1, 0, 1, 1 },
                { 1, 0, 0, 1 },
                { 1, 1, 1, 1 },
                { 1, 0, 0, 0 },
                { 1, 0, 0, 1 }
        };

        for (int[] row : seats) {
            for (int seat : row) {
                if (seat == 0)
                    numberOfFreeSeats++;
                System.out.print(seat + " ");
            }
            System.out.println();
        }

        System.out.format("free seats: %d", numberOfFreeSeats);

        System.out.println("---------------");
        toggleSeat(seats, 3, 1);
        System.out.println("free seats: " + numberOfFreeSeats);
        printSeats(seats);

        System.out.println("---------------");
        toggleSeat(seats, 0, 1);
        printSeats(seats);
        System.out.println("free seats: " + numberOfFreeSeats);

        System.out.println("---------------");
        toggleSeat(seats, 1, 1);
        toggleSeat(seats, 1, 2);
        printSeats(seats);
        System.out.println("free seats: " + numberOfFreeSeats);

        System.out.println("---------------");
        toggleSeat(seats, 0, 0);
        toggleSeat(seats, 0, 3);
        printSeats(seats);
        System.out.println("free seats: " + numberOfFreeSeats);

    }

    static void toggleSeat(int[][] seats, int row, int col) {
        if (row < 0 || row >= seats.length) {
            System.out.format("no such row (%d) in the bus%n", row);
            return;
        }

        if (col < 0 || col >= seats[row].length) {
            System.out.format("no such col (%d) int the row (%d)%n", col, row);
            return;
        }

        System.out.format("toggle seat [%d][%d]%n", row, col);
        int currentStatus = seats[row][col];
        numberOfFreeSeats = currentStatus == 0 ? numberOfFreeSeats - 1 : numberOfFreeSeats + 1;
        seats[row][col] = currentStatus == 0 ? 1 : 0;
    }

    static void printSeats(int[][] seats) {
        for (int[] row : seats) {
            for (int seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }
}
