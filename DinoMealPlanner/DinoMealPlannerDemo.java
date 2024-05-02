// a program that calculates the meal portions and feeding times for each dinosaur

package DinoMealPlanner;

import DinoProfile.DinoProfile;
import DinoProfile.DinoSpecies;

public class DinoMealPlannerDemo {
    public static void main(String... args) {

        DinoProfile dino0 = new DinoProfile("peter", 17, DinoSpecies.ANKYLOSAURUS, 3000, 70, 50, 60);
        DinoProfile dino1 = new DinoProfile("sam", 23, DinoSpecies.ANATOTITAN, 1000);
        DinoProfile dino2 = new DinoProfile("pam", 12, DinoSpecies.ALLOSAURUS, 15000);
        DinoProfile dino3 = new DinoProfile("ham", 53, DinoSpecies.ALBERTOSAURUS, 7000);
        DinoProfile dino4 = new DinoProfile("tom", 86, DinoSpecies.APATOSAURUS, 4500);

        DinoProfile[] dinos = { dino0, dino1, dino2, dino3, dino4 };

        for (DinoProfile dino : dinos) {
            String dinoName = dino.getName();
            double feedingPortion = dino.getAmountOfFoodPerFeeding();
            int feedingHour = dino.getFeedingHour();
            int feedingCount = dino.getFeedingsPerDay();

            for (int currentHour = 0; currentHour < 24; currentHour++) {
                int feedingHourDelta = feedingHour - currentHour;

                if (feedingHourDelta == 0) {
                    System.out.format("It's %d:00! Time to feed %s with %.2f kg of food (%d to go)%n", currentHour,
                            dinoName,
                            feedingPortion, --feedingCount);
                }
            }
        }

    }

}
