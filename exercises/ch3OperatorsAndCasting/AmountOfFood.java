// 2. a program that determines the amount of food required for a dinosaur based on its weight
// program should use the dinosaur’s weight to calculate how much food it needs to eat per meal

package exercises.ch3OperatorsAndCasting;

import java.util.Formatter;
import java.util.Locale;

import DinoProfile.DinoDiet;
import DinoProfile.DinoProfile;

public class AmountOfFood {
    public static void main(String... args) {

        DinoProfile dinoOne = new DinoProfile("greg", 13, "ground", DinoDiet.CARNIVORE, 2000, 0.05, 2);

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);

        formatter.format("Ammount of food to feed %s per day is %.2f: %d times with %.2f kg", dinoOne.getName(),
                dinoOne.getAmountOfFoodPerDay(), dinoOne.getFeedingsPerDay(), dinoOne.getAmountOfFoodPerFeeding());

        System.out.println(formatter);
    }
}
