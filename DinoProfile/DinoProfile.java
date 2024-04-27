package DinoProfile;

import java.util.Formatter;
import java.util.Locale;

public class DinoProfile {
    private String name;
    private int age;
    private String species;
    private DinoDiet diet;
    private int weight;
    private int feedingsPerDay;

    /**
     * kg per weight in a day to sustain
     */
    private double metabolicRate;
    private double amountOfFoodPerDay;

    public DinoProfile(String name, int age, String species, DinoDiet diet, int weight) {
        this(name, age, species, diet, weight, 0, 2);
    }

    public DinoProfile(String name, int age, String species, DinoDiet diet, int weight, double metabolicRate,
            int feedingsPerDay) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.diet = diet;
        this.weight = weight;
        this.metabolicRate = metabolicRate;
        this.feedingsPerDay = feedingsPerDay;
        this.amountOfFoodPerDay = calculateAmountOfFoodForDay();
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

    public int getAge() {
        return age;
    }

    public DinoDiet getDiet() {
        return diet;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getWeight() {
        return weight;
    }

    public double getMetabolicRate() {
        return metabolicRate;
    }

    private double calculateAmountOfFoodForDay() {
        return metabolicRate * weight;
    }

    public double getAmountOfFoodPerDay() {
        return amountOfFoodPerDay;
    }

    public double getAmountOfFoodPerFeeding() {
        return this.getAmountOfFoodPerDay() / feedingsPerDay;
    }

    public int getFeedingsPerDay() {
        return feedingsPerDay;
    }
}
