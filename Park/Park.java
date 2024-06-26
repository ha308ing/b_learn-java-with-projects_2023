package Park;

import java.time.LocalTime;

public class Park {
    private String name;
    private LocalTime openingHours;
    private LocalTime closingHours;
    private int maxCapacity;
    private int currentCapacity;
    private int safetyRating;

    public Park(String name, String openingHours, String closingHours, int maxCapacity, int safetyRating) {
        this.name = name;
        this.openingHours = LocalTime.parse(openingHours);
        this.closingHours = LocalTime.parse(closingHours);
        this.maxCapacity = maxCapacity;
        this.safetyRating = safetyRating;
    }

    public String getName() {
        return name;
    }

    public LocalTime getOpeningHours() {
        return openingHours;
    }

    public LocalTime getClosingHours() {
        return closingHours;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
        return this.currentCapacity;
    }

    public int incrementCurrentCapacity(int increment) {
        currentCapacity += increment;
        return currentCapacity;
    }

    public int decrementCurrentCapacity(int decrement) {
        currentCapacity -= decrement;
        return currentCapacity;
    }

    public boolean isCapacityOver() {
        return currentCapacity >= maxCapacity;
    }

    public int setSafetyRating(int safetyRating) {
        this.safetyRating = safetyRating;
        return this.safetyRating;
    }

    public int incrementSafetyRating(int increment) {
        safetyRating += increment;
        return safetyRating;
    }

    public int decrementSafetyRating(int decrement) {
        safetyRating -= decrement;
        return safetyRating;
    }

    public boolean isSafetyRatingOver(int safetyRating) {
        return this.safetyRating >= safetyRating;
    }

    public boolean isSafetyRatingBelow(int safetyRating) {
        return this.safetyRating < safetyRating;
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    public boolean isOpen(LocalTime time) {
        int compareOpening = time.compareTo(openingHours);
        int compareClosing = time.compareTo(closingHours);
        boolean isWithinWorkingHours = compareClosing <= 0 && compareOpening >= 0;
        return isWithinWorkingHours;
    }

    public boolean isOpen() {
        LocalTime time = LocalTime.now();
        return isOpen(time);
    }

}
