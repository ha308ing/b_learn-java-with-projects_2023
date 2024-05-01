package exercises.ch4ConditionalStatements;

import java.util.Scanner;

import DinoProfile.DinoSpecies;

public class SpeciesDescription {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

        DinoSpecies species = DinoSpecies.printSpeciesSelector(scanner);

        scanner.close();

        switch (species) {
            case ALBERTOSAURUS:
                System.out.println("albertosaurus");
                break;
            case ALLOSAURUS:
                System.out.println("allosaurus");
                break;
            case ANATOTITAN:
                System.out.println("anatotitan");
                break;
            case ANKYLOSAURUS:
                System.out.println("ankylosaurus");
                break;
            case APATOSAURUS:
                System.out.println("apatosaurus");
                break;

            default:
                System.out.println("i do not know this species");
                break;
        }

    }
}
