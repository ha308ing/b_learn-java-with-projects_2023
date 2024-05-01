// 2. a program that determines the amount of food required for a dinosaur based on its weight
// program should use the dinosaur’s weight to calculate how much food it needs to eat per meal

package exercises.ch3OperatorsAndCasting;

import java.util.Formatter;
import java.util.Locale;

import DinoProfile.DinoProfile;
import DinoProfile.DinoSpecies;

public class AmountOfFood {
    public static void main(String... args) {

        DinoProfile dinoOne = new DinoProfile("greg", 13, DinoSpecies.ANKYLOSAURUS, 2000, 65, 35, 17, 0.05);

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);

        formatter.format("Amount of food to feed %s (%s size) per day is %.2f: %d times with %.2f kg",
                dinoOne.getName(),
                dinoOne.getSize(),
                dinoOne.getAmountOfFoodPerDay(), dinoOne.getFeedingsPerDay(), dinoOne.getAmountOfFoodPerFeeding());

        System.out.println(formatter);
    }
}
