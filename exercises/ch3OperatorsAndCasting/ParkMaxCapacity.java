// 4. a program that checks whether the park’s maximum capacity has been reached

package exercises.ch3OperatorsAndCasting;

import Park.Park;

public class ParkMaxCapacity {

    public static void main(String... args) {

        Park park = new Park("Mezoic Park", "08:00", "22:00", 22000, 75);

        park.setCurrentCapacity(12000);

        testParkCapacity(park, park.getCurrentCapacity() + 2000);
        testParkCapacity(park, park.getMaxCapacity() + 2000);
        testParkCapacity(park, park.getMaxCapacity() - 2000);

    }

    static void testParkCapacity(Park park, int testCapacity) {
        park.setCurrentCapacity(testCapacity);

        if (park.isCapacityOver())
            System.out.format("%s capacity (%d) is over it's max capacity (%d)%n", park.getName(),
                    park.getCurrentCapacity(), park.getMaxCapacity());
        else
            System.out.format("%s capacity (%d) is smaller than it's max capacity (%d)%n", park.getName(),
                    park.getCurrentCapacity(), park.getMaxCapacity());

    }

}
