// a program that finds the heaviest dinosaur
// a program that finds the smallest dinosaur
// a program that calculates average age using an array of dinosaur ages

package exercises.ch6Arrays;

import DinoProfile.DinoProfile;
import DinoProfile.DinoSpecies;

public class HighLowWAveADino {
    public static void main(String... args) {

        DinoProfile dino0 = new DinoProfile("sam", 13, DinoSpecies.ANATOTITAN, 3000);
        DinoProfile dino1 = new DinoProfile("pam", 73, DinoSpecies.ALLOSAURUS, 6000);
        DinoProfile dino2 = new DinoProfile("tom", 35, DinoSpecies.APATOSAURUS, 8000);
        DinoProfile dino3 = new DinoProfile("mel", 47, DinoSpecies.ANKYLOSAURUS, 2000);
        DinoProfile dino4 = new DinoProfile("rev", 27, DinoSpecies.ALBERTOSAURUS, 6000);
        DinoProfile dino5 = new DinoProfile("ken", 43, DinoSpecies.ANATOTITAN, 5000);

        DinoProfile[] dinos = { dino0, dino1, dino2, dino3, dino4, dino5 };

        int maxWeight = 0;
        int minWeight = dino0.getWeight();
        double ageTotal = 0;
        double ageAverage = 0;
        DinoProfile heaviestDino = dino0;
        DinoProfile lightestDino = dino0;

        for (DinoProfile dino : dinos) {
            ageTotal += dino.getAge();
            int dinoWeight = dino.getWeight();
            if (dinoWeight > maxWeight) {
                maxWeight = dinoWeight;
                heaviestDino = dino;
            }

            if (dinoWeight < minWeight) {
                minWeight = dinoWeight;
                lightestDino = dino;
            }
        }

        ageAverage = ageTotal / dinos.length;

        System.out.format("The heaviest dino is %s (%d)", heaviestDino.getName(), maxWeight);
        System.out.println();
        System.out.format("The lightest dino is %s (%d)", lightestDino.getName(), minWeight);
        System.out.println();
        System.out.format("Average dinos age: %.2f", ageAverage);

    }
}
