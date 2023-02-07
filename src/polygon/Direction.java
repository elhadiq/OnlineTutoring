package polygon;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

enum Direction{
    TOP(true,false),
    BOTTOM(true,true),
    LEFT(false,false),
    RIGHT(false,true);


    //Constants


    static final Set<Direction> HORIZONTAL_BOUNDS= new HashSet<>(Arrays.asList(TOP,BOTTOM));
    static final  Set<Direction> VERTICAL_BOUNDS=new HashSet<>(Arrays.asList(LEFT,RIGHT));

    private final boolean horizontal;   // in kilograms
    private final boolean increment; // in meters


    Direction(boolean horizontal, boolean increment) {
        this.horizontal = horizontal;
        this.increment = increment;
    }

    public boolean isHorizontal() {
        return this.horizontal;
    }

    public boolean isIncrement() {
        return this.increment;
    }
}

