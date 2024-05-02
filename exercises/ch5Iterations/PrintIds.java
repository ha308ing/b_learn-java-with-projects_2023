// a for loop that prints out the IDs of the first 100 dinosaurs

package exercises.ch5Iterations;

public class PrintIds {
    public static void main(String... args) {

        for (int i = 1; i < 101; i++) {
            System.out.format("dino%d%n", i);
        }

    }
}
