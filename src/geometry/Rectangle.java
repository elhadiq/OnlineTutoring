package geometry;

import java.util.EnumMap;
import java.util.List;

public final class Rectangle <T>{
    private final EnumMap<Direction, T> borders;

    public Rectangle(EnumMap<Direction, T> borders) {
        this.borders = borders;
    }
    T getBorder(Direction direction){
        return this.borders.get(direction);
    }

    EnumMap<Direction, T> getBorders(List <Direction>  directions){
        EnumMap<Direction, T> borders=new EnumMap<>(Direction.class);
        for (Direction direction:directions) {
            borders.put(direction,this.getBorder(direction));
        }
        return  borders;

    }
    public T bottom(){return getBorder(Direction.BOTTOM);}
    public T top() {return getBorder(Direction.TOP);}
    public T left (){return getBorder(Direction.LEFT);}
    public T right(){return getBorder(Direction.RIGHT);}

}
