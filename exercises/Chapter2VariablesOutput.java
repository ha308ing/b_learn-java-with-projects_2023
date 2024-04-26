package exercises;

import java.util.Formatter;
import java.util.Locale;

public class Chapter2VariablesOutput {
    public static void main(String... args) {

        enum DinoDiet {
            HERBIVORE,
            CARNIVORE
        }

        class Person {
            private String name;
            private int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public void printPerson() {
                System.out.format("%s: %d years%n", this.name, this.age);
            }
        }

        class Employee extends Person {
            String role;

            Employee(String name, int age, String role) {
                super(name, age);
                this.role = "manager";
            }

            public void printEmployee() {
                System.out.format("%s is a %s %d years old%n", super.name, this.role, super.age);
            }
        }

        class Dino {

            private String name;
            private int age;
            private DinoDiet diet;
            private char speciesLetter;

            Dino(String name, int age, DinoDiet diet, char speciesLetter) {
                this.name = name;
                this.age = age;
                this.diet = diet;
                this.speciesLetter = speciesLetter;
            }

            public void printDino() {
                String dinoString = this.name + " is " + this.age + " years old and is " + this.diet
                        + " species letter: " + this.speciesLetter;
                System.out.println(dinoString);
            }
        }

        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);

        String breed = "labrador";
        double height = 12;
        double length = 5;
        double weight = 17;

        boolean isCarnivorous = true;
        int maximumVisitors = 255;
        int dinoQty = 17;
        short safetyRating = 6;

        Formatter outputString = formatter.format(
                "breed: %s%nheight: %.2f%nlength: %.2f%nweight: %.2f%ncarnivore: %b%n%n",
                breed, height,
                length,
                weight,
                isCarnivorous);

        formatter.format("There's a maximum of %d people allowed in Mesozoic Eden", maximumVisitors);

        System.out.println(outputString);
        System.out.println("Quantity of the dinos: " + dinoQty);
        System.out.println("Safety rating: " + safetyRating);

        Employee peter = new Employee("Peter", 3, "manager");
        peter.printPerson();
        peter.printEmployee();

        String dinoName = "dino-rex";
        int dinoAge = 12;
        char dinoSpeciesLetter = 'r';
        DinoDiet dinoDiet = DinoDiet.CARNIVORE;
        Dino rex = new Dino(dinoName, dinoAge, dinoDiet, dinoSpeciesLetter);
        rex.printDino();

    }

}
