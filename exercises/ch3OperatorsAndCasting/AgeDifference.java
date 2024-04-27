// 5. a program that calculates the age difference between two dinosaurs

package exercises.ch3OperatorsAndCasting;

import java.util.Formatter;
import java.util.Locale;

import DinoProfile.DinoDiet;
import DinoProfile.DinoProfile;

public class AgeDifference {
    public static void main(String... args) {
        DinoProfile dinoOne = new DinoProfile("greg", 13, "ground", DinoDiet.CARNIVORE, 13);

        DinoProfile dinoTwo = new DinoProfile("fred", 17, "fire", DinoDiet.HERBIVORE, 44);

        int ageDifference = getAgeDifference(dinoOne, dinoTwo);

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);

        formatter.format("Age difference of %s (%d) and %s (%d) is %d", dinoOne.getName(), dinoOne.getAge(),
                dinoTwo.getName(), dinoTwo.getAge(), ageDifference);

        System.out.println(formatter);

    }

    static int getAgeDifference(DinoProfile dinoOne, DinoProfile dinoTwo) {
        int dinoOneAge = dinoOne.getAge();
        int dinoTwoAge = dinoTwo.getAge();
        int ageDifference = Math.abs(dinoOneAge - dinoTwoAge);
        return ageDifference;
    }

}
