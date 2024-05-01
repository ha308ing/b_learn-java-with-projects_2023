package notes;

/**
 * Scope
 */
public class Scope {

    public static void main(String... args) {

        int x = 7;

        // if (x > 3) {
        {
            // int x = 3;
            int y = 8;

            x += y;
        }
        x++;
        // y++;

        System.out.println("x: " + x);

    }
}
