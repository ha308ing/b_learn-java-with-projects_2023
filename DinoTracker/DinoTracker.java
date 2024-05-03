// print information about all the dinosaurs and print their average age and weight

package DinoTracker;

import DinoProfile.DinoProfile;
import DinoProfile.DinoSpecies;

public class DinoTracker {
    public static void main(String... args) {

        final int DINOS_COUNT = 6;

        DinoProfile dino0 = new DinoProfile("sam", 13, DinoSpecies.ANATOTITAN, 3000);
        DinoProfile dino1 = new DinoProfile("pam", 73, DinoSpecies.ALLOSAURUS, 6000);
        DinoProfile dino2 = new DinoProfile("tom", 35, DinoSpecies.APATOSAURUS, 8000);
        DinoProfile dino3 = new DinoProfile("mel", 47, DinoSpecies.ANKYLOSAURUS, 2000);
        DinoProfile dino4 = new DinoProfile("rev", 27, DinoSpecies.ALBERTOSAURUS, 6000);
        DinoProfile dino5 = new DinoProfile("ken", 43, DinoSpecies.ANATOTITAN, 5000);

        DinoProfile[] dinos = { dino0, dino1, dino2, dino3, dino4, dino5 };

        String[] names = new String[DINOS_COUNT];
        int[] ages = new int[DINOS_COUNT];
        String[] species = new String[DINOS_COUNT];
        int[] enclosureId = new int[DINOS_COUNT];

        double totalWeight = 0;
        double avgWeight = 0;
        double totalAge = 0;
        double avgAge = 0;

        for (int i = 0; i < dinos.length; i++) {
            DinoProfile dino = dinos[i];
            String dinoName = dino.getName();
            int dinoAge = dino.getAge();
            String dinoSpecies = dino.getSpecies().toString();
            int dinoWeight = dino.getWeight();

            names[i] = dinoName;
            ages[i] = dinoAge;
            species[i] = dinoSpecies;
            enclosureId[i] = i + 1;

            totalWeight += dinoWeight;
            totalAge += dinoAge;
        }

        avgAge = totalAge / DINOS_COUNT;
        avgWeight = totalWeight / DINOS_COUNT;

        for (int i = 0; i < DINOS_COUNT; i++) {
            System.out.format("id: %d%nname: %s%nage: %d%nspecies: %s%nenclosureId: %d%nweight: %d%n-----%n", i,
                    names[i], ages[i],
                    species[i], enclosureId[i], dinos[i].getWeight());
        }

        System.out.format("Average weight: %.2f%n", avgWeight);
        System.out.format("Average age: %.2f%n", avgAge);
    }
}
