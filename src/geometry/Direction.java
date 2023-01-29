package geometry;

public enum Direction{
    TOP(true,false),
    BOTTOM(true,true),
    LEFT(false,false),
    RIGHT(false,true);

    private final boolean horizontal;   // in kilograms
    private final boolean increment; // in meters


    Direction(boolean horizontal, boolean increment) {
        this.horizontal = horizontal;
        this.increment = increment;
    }

    public boolean isHorizontal() {
        return horizontal;
    }

    public boolean isIncrement() {
        return increment;
    }
}

