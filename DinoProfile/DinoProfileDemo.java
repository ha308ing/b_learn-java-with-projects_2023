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
            String species = "";
            int age = 0;
            int dietRaw = 0;
            int weight = 0;
            DinoDiet diet;

            System.out.print("Enter name: ");
            name = scanner.next();

            System.out.print("Enter species: ");
            species = scanner.next();

            System.out.print("Enter age: ");
            age = scanner.nextInt();

            System.out.print("Enter diet carnivore (0) or herbivore (1): ");
            dietRaw = scanner.nextInt();
            // diet = dietRaw == 0 ? DinoDiet.CARNIVORE : DinoDiet.HERBIVORE; ? doesn't work
            // =(
            if (dietRaw == 0)
                diet = DinoDiet.CARNIVORE;
            else
                diet = DinoDiet.HERBIVORE;

            System.out.print("Enter weight: ");
            weight = scanner.nextInt();

            DinoProfile newDino = new DinoProfile(name, age, species, diet, weight);
            dinos.add(newDino);
        }

        System.out.format("%nDino Profiles:%n%n");
        for (DinoProfile dino : dinos) {
            dino.printDinoInfo();
        }

        scanner.close();
    }
}
