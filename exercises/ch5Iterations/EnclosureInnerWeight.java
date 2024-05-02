// total weight of all dinosaurs in a specific enclosure

package exercises.ch5Iterations;

import DinoProfile.DinoProfile;
import DinoProfile.DinoSpecies;

public class EnclosureInnerWeight {
    public static void main(String... args) {

        DinoProfile greg = new DinoProfile("greg", 17, DinoSpecies.ANATOTITAN, 17);
        DinoProfile peter = new DinoProfile("peter", 27, DinoSpecies.ANKYLOSAURUS, 81);
        DinoProfile tom = new DinoProfile("tom", 11, DinoSpecies.ALLOSAURUS, 3);
        DinoProfile roman = new DinoProfile("roman", 44, DinoSpecies.ANATOTITAN, 39);

        DinoProfile[] dinos = { greg, peter, roman, tom };
        int weight = 0;

        for (DinoProfile dino : dinos) {
            weight += dino.getWeight();
        }

        System.out.format("Summary weight inside of the closure: %d", weight);

    }
}
