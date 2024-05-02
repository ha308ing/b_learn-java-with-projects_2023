// a do-while loop that continues to feed a dinosaur until it is no longer hungry

package exercises.ch5Iterations;

public class FeedingLoop {
    public static void main(String... args) {

        final int fullThreshold = 50;
        int feedCount = 0;

        do {
            feedCount++;
            System.out.format("feed #%d%n", feedCount);
        } while (feedCount < fullThreshold);

        System.out.format("Full %d", feedCount);

    }
}
