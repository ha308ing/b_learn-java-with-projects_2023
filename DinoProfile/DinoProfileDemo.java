package DinoProfile;

import java.util.Scanner;
import java.util.ArrayList;

public class DinoProfileDemo {
    public static void main(String... args) {
        int dinosQty = 0;
        ArrayList<DinoProfile> dinos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.format("Hello!%nHow many dinos to add? ");

        dinosQty = scanner.nextInt();

        for (int dinoCounter = 0; dinoCounter < dinosQty; dinoCounter++) {
            String name = "";
            int speciesRaw = 0;
            DinoSpecies species;
            int age = 0;
            int weight = 0;

            System.out.print("Enter name: ");
            name = scanner.next();

            System.out.println("Enter species: ");
            int speciesCounter = 1;
            for (DinoSpecies spieces : DinoSpecies.values()) {
                System.out.println(speciesCounter++ + " " + spieces);
            }

            speciesRaw = scanner.nextInt() - 1;
            species = DinoSpecies.values()[speciesRaw];

            System.out.print("Enter age: ");
            age = scanner.nextInt();

            System.out.print("Enter weight: ");
            weight = scanner.nextInt();

            DinoProfile newDino = new DinoProfile(name, age, species, weight);
            dinos.add(newDino);
        }

        System.out.format("%nDino Profiles:%n%n");
        for (DinoProfile dino : dinos) {
            dino.printDinoInfo();
        }

        scanner.close();
    }
}
