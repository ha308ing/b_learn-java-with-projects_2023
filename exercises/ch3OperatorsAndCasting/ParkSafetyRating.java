// 6. a program that checks whether the park’s safety rating is above a certain threshold

package exercises.ch3OperatorsAndCasting;

import Park.Park;

public class ParkSafetyRating {

    public static void main(String... args) {

        Park park = new Park("Mezoic Park", "08:00", "22:00", 22000, 75);

        testSaferyRating(park, 76);
        testSaferyRating(park, 12);

    }

    static void testSaferyRating(Park park, int safetyRating) {
        String parkName = park.getName();
        int parkSafetyRating = park.getSafetyRating();
        boolean parkIsSafetyRatingOver = park.isSafetyRatingOver(safetyRating);

        if (parkIsSafetyRatingOver)
            System.out.format("%s safety rating (%d) is over %d%n", parkName,
                    parkSafetyRating, safetyRating);
        else
            System.out.format("%s safety rating (%d) is smaller than %d%n", parkName,
                    parkSafetyRating, safetyRating);

    }

}
