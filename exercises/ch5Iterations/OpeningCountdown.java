// a while loop to print out a countdown to the park’s opening time

package exercises.ch5Iterations;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class OpeningCountdown {
    public static void main(String... args) {

        final ZoneOffset ZONE = ZoneOffset.of("Z");
        final long COUNTDOWN_DURATION = 1;

        LocalDateTime now = LocalDateTime.now();
        long nowSeconds = now.toEpochSecond(ZONE);
        LocalDateTime openTime = now.plusMinutes(COUNTDOWN_DURATION);

        long openTimeSeconds = openTime.toEpochSecond(ZONE);

        long delta = openTimeSeconds - nowSeconds;
        int seconds = 0;
        boolean isDeltaSame = false;

        while (delta > 0) {
            LocalDateTime deltaTime = LocalDateTime.ofEpochSecond(delta, 0, ZONE);

            int deltaSeconds = deltaTime.getSecond();

            if (!isDeltaSame)
                System.out.format("to the opening %1$tH:%<tM:%<tS%n", deltaTime);

            LocalDateTime nowTemp = LocalDateTime.now();
            long nowTempSeconds = nowTemp.toEpochSecond(ZONE);

            delta = openTimeSeconds - nowTempSeconds;

            LocalDateTime newDelta = LocalDateTime.ofEpochSecond(delta, seconds, ZONE);

            seconds = newDelta.getSecond();

            isDeltaSame = deltaSeconds == seconds;
        }

        System.out.format("Park is open! %tH:%<tM", openTime);

    }
}
