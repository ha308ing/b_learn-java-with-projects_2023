package exercises.ch4ConditionalStatements;

import java.util.Formatter;
import java.util.Scanner;

import DinoProfile.DinoSpecies;

public class StaffExperienceChecker {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        DinoSpecies species = DinoSpecies.printSpeciesSelector(scanner);

        System.out.print("Enter experience: ");
        int experience = scanner.nextInt();
        scanner.close();

        int requiredExperience = species.getRequiredExperience();

        formatter.format("Experience %d is ", experience);

        if (experience >= requiredExperience) {
            formatter.format("ok");
        } else {
            formatter.format("not ok");
        }

        formatter.format(" (%d is required).", requiredExperience);

        System.out.println(formatter);

    }
}
