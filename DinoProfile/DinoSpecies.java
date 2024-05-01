package DinoProfile;

import java.util.Scanner;

public enum DinoSpecies {
    ALBERTOSAURUS(DinoDiet.HERBIVORE),
    ALLOSAURUS(DinoDiet.CARNIVORE),
    ANATOTITAN(DinoDiet.HERBIVORE, 25),
    ANKYLOSAURUS(DinoDiet.CARNIVORE),
    APATOSAURUS(DinoDiet.HERBIVORE);
    // BAROSAURUS(DinoDiet.HERBIVORE),
    // BRACHIOSAURUS(DinoDiet.CARNIVORE),
    // BRONTOSAURUS(DinoDiet.HERBIVORE),
    // CAMARASAURUS(DinoDiet.CARNIVORE),
    // CAMPTOSAURUS(DinoDiet.HERBIVORE),
    // CENTROSAURUS(DinoDiet.HERBIVORE),
    // CHASMOSAURUS(DinoDiet.HERBIVORE),
    // COELOPHYSIS(DinoDiet.CARNIVORE),
    // CORYTHOSAURUS(DinoDiet.CARNIVORE),
    // DEINONYCHUS(DinoDiet.HERBIVORE),
    // DIPLODOCUS(DinoDiet.HERBIVORE),
    // EDMONTONIA(DinoDiet.HERBIVORE),
    // EDMONTOSAURUS(DinoDiet.CARNIVORE),
    // HESPERORNIS(DinoDiet.HERBIVORE),
    // MAMENCHISAURUS(DinoDiet.CARNIVORE),
    // ORNITHOLESTES(DinoDiet.CARNIVORE),
    // PLATEOSAURUS(DinoDiet.HERBIVORE),
    // STEGOSAURUS(DinoDiet.HERBIVORE),
    // TRICERATOPS(DinoDiet.CARNIVORE),
    // TYRANNOSAURUS(DinoDiet.HERBIVORE);

    protected final DinoDiet diet;
    protected final int requiredExperience;

    DinoSpecies(DinoDiet dinoDiet) {
        this(dinoDiet, 5);
    }

    DinoSpecies(DinoDiet dinoDiet, int requiredExperience) {
        diet = dinoDiet;
        this.requiredExperience = requiredExperience;
    }

    public static void printSpecies() {
        int counter = 0;
        for (DinoSpecies species : DinoSpecies.values()) {
            System.out.println(counter++ + " " + species);
        }
    }

    public int getRequiredExperience() {
        return requiredExperience;
    }

    public static DinoSpecies printSpeciesSelector(Scanner scanner) {

        int speciesRaw = -1;
        DinoSpecies species;

        while (speciesRaw < 0 || speciesRaw > DinoSpecies.values().length) {

            System.out.println("Select the species:");
            DinoSpecies.printSpecies();
            speciesRaw = scanner.nextInt();

        }

        species = DinoSpecies.values()[speciesRaw];

        return species;
    }

}
