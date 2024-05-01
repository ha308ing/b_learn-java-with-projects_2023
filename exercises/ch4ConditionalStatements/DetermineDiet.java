package exercises.ch4ConditionalStatements;

import java.util.Formatter;

import DinoProfile.DinoDiet;
import DinoProfile.DinoProfile;
import DinoProfile.DinoSpecies;

public class DetermineDiet {
    public static void main(String... args) {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        final DinoProfile dino = new DinoProfile("greg", 12, DinoSpecies.ALLOSAURUS, 17);

        final String dinoName = dino.getName();
        final DinoDiet dinoDiet = dino.getDiet();

        formatter.format("dino %s", dinoName);

        if (dinoDiet == DinoDiet.CARNIVORE) {
            formatter.format(" is carnivore");
        } else if (dinoDiet == DinoDiet.HERBIVORE) {
            formatter.format(" is herbivore");
        } else {
            formatter.format(" is nor carnivore nor herbivore");
        }

        /*
         * formatter.format("%s",
         * switch (dinoDiet) {
         * case DinoDiet.CARNIVORE -> " is carnivore";
         * case DinoDiet.HERBIVORE -> " is herbivore";
         * });
         */

        System.out.println(formatter);
    }
}
