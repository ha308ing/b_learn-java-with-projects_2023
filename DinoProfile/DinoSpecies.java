package DinoProfile;

import java.util.Scanner;

public enum DinoSpecies {
    ALBERTOSAURUS(DinoDiet.HERBIVORE),
    ALLOSAURUS(DinoDiet.CARNIVORE),
    ANATOTITAN(3, DinoDiet.HERBIVORE, 0.03, 10),
    ANKYLOSAURUS(6, DinoDiet.CARNIVORE, 0.06, 7),
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
    protected final int feedingHour;
    protected final double metabolicRate;

    DinoSpecies(DinoDiet dinoDiet) {
        this(5, dinoDiet, 0.05, 8);
    }

    DinoSpecies(int requiredExperience, DinoDiet dinoDiet, double metabolicRate, int feedingHour) {
        diet = dinoDiet;
        this.feedingHour = feedingHour < 0 ? 0 : feedingHour > 24 ? 23 : feedingHour;
        this.metabolicRate = metabolicRate;
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

    public int getFeedingHour() {
        return feedingHour;
    }

    public DinoDiet getDiet() {
        return diet;
    }

    public double getMetabolicRate() {
        return metabolicRate;
    }
}
