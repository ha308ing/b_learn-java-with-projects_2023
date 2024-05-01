package exercises.ch4ConditionalStatements;

import java.util.Formatter;

import DinoProfile.DinoProfile;
import DinoProfile.DinoSize;
import DinoProfile.DinoSpecies;

public class DetermineEnclosure {
    public static void main(String... args) {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb);

        final DinoProfile dino = new DinoProfile("greg", 12, DinoSpecies.ALLOSAURUS, 17, 75, 65, 25, 0.3);

        final String dinoName = dino.getName();
        final DinoSize dinoSize = dino.getSize();
        String enclosure = "";

        switch (dinoSize) {
            case XS -> enclosure = "extra small";
            case S -> enclosure = "small";
            case M -> enclosure = "medium";
            case L -> enclosure = "large";
            case XL -> enclosure = "extra large";
        }

        formatter.format("dino %s (%s) needs an %s enclosure", dinoName, dinoSize, enclosure);

        System.out.println(formatter);
    }
}
