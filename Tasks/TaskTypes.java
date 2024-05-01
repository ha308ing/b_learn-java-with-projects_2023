package Tasks;

public enum TaskTypes {
    FEEDING(1),
    CLEANING,
    SECURITY,
    TOUR_GUIDING(3);

    private int duration;

    TaskTypes(int duration) {
        this.duration = duration;
    }

    TaskTypes() {
        this(1);
    }

    public int getDuration() {
        return duration;
    }

}
