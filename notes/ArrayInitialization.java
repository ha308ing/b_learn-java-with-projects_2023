package notes;

public class ArrayInitialization {

    public static void main(String... args) {

        // int[] ages = new int[5];
        int[] ages = { 35, 43, 27 };

        int age1 = ages[1];
        ages[1] = age1 - 1;

        double total = 0, average = 0;

        for (int i = 0; i < ages.length; i++) {
            ages[i] *= 2;
        }

        for (int age : ages) {
            total += age;
            System.out.format("%d ", age);
        }

        average = total / ages.length;

        System.out.format("%naverage age: %.2f%n", average);

    }

}
