package DinoProfile;

import java.util.Formatter;
import java.util.Locale;

public class DinoProfile {
    private String name;
    private int age;
    private String species;
    private DinoDiet diet;
    private int weight;

    DinoProfile(String name, int age, String species, DinoDiet diet, int weight) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.diet = diet;
        this.weight = weight;
    }

    public void printDinoInfo() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);

        formatter.format("--- Dino %s ---%n", this.name);
        formatter.format("Age: %d%n", this.age);
        formatter.format("Species: %s%n", this.species);
        formatter.format("Diet: %s%n", this.diet.toString());
        formatter.format("Weight: %d%n%n", this.weight);

        System.out.println(formatter);
    }
}
