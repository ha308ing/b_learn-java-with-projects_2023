package DinoProfile;

import java.util.Formatter;
import java.util.Locale;

public class DinoProfile {
    private String name;
    private int age;
    private DinoSpecies species;
    private DinoDiet diet;
    private int weight;
    private int feedingsPerDay;
    private int length;
    private int height;
    private int width;
    private DinoSize size;

    /**
     * kg per weight in a day to sustain
     */
    private double metabolicRate;
    private double amountOfFoodPerDay;
    private int feedingHour;

    public DinoProfile(String name, int age, DinoSpecies species, int weight) {
        this(name, age, species, weight, 0, 0, 0);
    }

    public DinoProfile(String name, int age, DinoSpecies species, int weight, int length, int height, int width) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.diet = species.diet;
        this.weight = weight;
        metabolicRate = species.getMetabolicRate();
        feedingHour = species.getFeedingHour();
        this.feedingsPerDay = calculateFeedingsPerDay();
        this.amountOfFoodPerDay = calculateAmountOfFoodForDay();
        this.length = length;
        this.height = height;
        this.width = width;
        this.size = calculateSize();
    }

    public void printDinoInfo() {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);

        formatter.format("--- Dino %s ---%n", this.name);
        formatter.format("Age: %d%n", this.age);
        formatter.format("Species: %s%n", this.species);
        formatter.format("Diet: %s%n", this.diet);
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

    public DinoSpecies getSpecies() {
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
        return amountOfFoodPerDay / feedingsPerDay;
    }

    public int getFeedingsPerDay() {
        return feedingsPerDay;
    }

    public int getFeedingHour() {
        return feedingHour;
    }

    private DinoSize calculateSize() {
        int linearSize = length + height + width;
        int xsLimit = 10 + 10 + 10;
        int sLimit = 20 + 20 + 20;
        int mLimit = 30 + 30 + 30;
        int lLimit = 40 + 40 + 40;

        if (linearSize > lLimit) {
            return DinoSize.XL;
        } else if (linearSize > mLimit) {
            return DinoSize.L;
        } else if (linearSize > sLimit) {
            return DinoSize.M;
        } else if (linearSize > xsLimit) {
            return DinoSize.S;
        } else {
            return DinoSize.XS;
        }
    }

    public DinoSize getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    private int calculateFeedingsPerDay() {
        if (weight > 3000) {
            return 5;
        } else if (weight > 2000) {
            return 3;
        } else {
            return 2;
        }
    }
}
