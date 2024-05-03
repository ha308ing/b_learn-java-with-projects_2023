// a two-dimensional array representing the park map,
// with each cell containing an array of Strings indicating an enclosure
// or facility for a certain section

package exercises.ch6Arrays;

import java.util.Scanner;

public class ParkMap {
    public static void main(String... args) {

        String[][] map = {
                { "entrance", "coasters", "dinos" },
                { "coasters", "fountain", "dinos" },
                { "dinos", "dinos", "dinos" },
        };

        Scanner scanner = new Scanner(System.in);
        int yLimit = map.length;
        int x = -1;
        int y = -1;
        boolean hasInt = false;

        while (!hasInt || y == -1) {
            System.out.print("Enter coordinate y: ");
            hasInt = scanner.hasNextInt();
            if (hasInt) {
                int input = scanner.nextInt();
                if (input > -1 && input < yLimit) {
                    y = input;
                } else {
                    hasInt = false;
                }
            } else {
                scanner.next();
            }
        }

        int xLimit = map[y].length;
        hasInt = false;

        while (!hasInt || x == -1) {
            System.out.print("Enter coordinate x: ");
            hasInt = scanner.hasNextInt();
            if (hasInt) {
                int input = scanner.nextInt();
                if (input > -1 && input < xLimit) {
                    x = input;
                } else {
                    hasInt = false;
                }
            } else {
                scanner.next();
            }
        }

        scanner.close();

        System.out.format("in coordinates [%d][%d] is %s", x, y, map[y][x]);

    }
}
