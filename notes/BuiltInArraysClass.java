package notes;

import java.util.Arrays;

public class BuiltInArraysClass {
    public static void main(String... args) {

        int[] array = { 4, 1, 2, 3 };

        Arrays.sort(array);

        String arrayString = Arrays.toString(array);
        System.out.println("array: " + arrayString);

        // binary search (must be on the sorted arrays)
        int target = 23;
        int targetIndex = Arrays.binarySearch(array, target);
        System.out.format("index of %d is %d%n", target, targetIndex);

        // copyOf
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        String arrayCopyString = Arrays.toString(arrayCopy);
        System.out.format("array copy: %s%n", arrayCopyString);

        // copyOf resizing (better use collections)
        int size = 10;
        int[] arrayResize = Arrays.copyOf(arrayCopy, size);
        String arrayResizeString = Arrays.toString(arrayResize);
        System.out.format("resized array: %s%n", arrayResizeString);

        // equals
        boolean isEqualOriginalAndCopy = Arrays.equals(array, arrayCopy);
        boolean isEqualOriginalAndResize = Arrays.equals(array, arrayResize);

        System.out.format("original and copy are equal: %b%n", isEqualOriginalAndCopy);
        System.out.format("original and resize are equal: %b%n", isEqualOriginalAndResize);

        // fill
        Arrays.fill(arrayCopy, 23);
        arrayCopyString = Arrays.toString(arrayCopy);
        System.out.format("array copy: %s%n", arrayCopyString);

    }
}
