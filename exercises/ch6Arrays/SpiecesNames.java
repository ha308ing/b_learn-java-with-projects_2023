// an array that holds the names of all the dinosaur species in the park

package exercises.ch6Arrays;

import java.util.Arrays;

import DinoProfile.DinoSpecies;

public class SpiecesNames {
    public static void main(String... args) {

        DinoSpecies[] species = DinoSpecies.values();
        String speciesString = Arrays.toString(species);

        System.out.format("Species of the park:%n%s", speciesString);

    }
}
