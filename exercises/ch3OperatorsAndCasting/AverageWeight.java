// 1. a program that calculates the average weight of two dinosaurs

package exercises.ch3OperatorsAndCasting;

import java.util.Formatter;
import java.util.Locale;

import DinoProfile.DinoProfile;
import DinoProfile.DinoSpecies;

public class AverageWeight {
    public static void main(String... args) {
        DinoProfile dinoOne = new DinoProfile("greg", 13, DinoSpecies.ALLOSAURUS, 13);

        DinoProfile dinoTwo = new DinoProfile("fred", 17, DinoSpecies.APATOSAURUS, 44);

        double averageWeight = getAverageWeight(dinoOne, dinoTwo);

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);

        formatter.format("Average weight of %s (%d) and %s (%d) is %.1f", dinoOne.getName(), dinoOne.getWeight(),
                dinoTwo.getName(), dinoTwo.getWeight(), averageWeight);

        System.out.println(formatter);

    }

    static double getAverageWeight(DinoProfile... dinos) {
        int count = dinos.length;
        double sum = 0;
        double averageWeight = 0;

        for (DinoProfile dino : dinos) {
            sum += dino.getWeight();
        }

        averageWeight = sum / count;

        return averageWeight;
    }
}
