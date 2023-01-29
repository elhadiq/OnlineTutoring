package geometry;

import org.w3c.dom.css.Rect;

import java.util.EnumMap;
import java.util.List;

public final class Rectangle <T extends Comparable>{



    private final EnumMap<Direction, T> borders;

    private Rectangle(EnumMap<Direction, T> borders) {
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
    public T right(){
        return getBorder(Direction.RIGHT);}

    public Rectangle<T> of (T top,T bottom,T left,T right) throws Exception{
        assert bottom.compareTo(top)<0 ||left.compareTo(right)<0:"The borders are out of order";
        EnumMap<Direction, T> borders=new EnumMap<>(Direction.class);
        borders.put(Direction.TOP,top);
        borders.put(Direction.BOTTOM,bottom);
        borders.put(Direction.LEFT,left);
        borders.put(Direction.RIGHT,right);
        return new Rectangle<>(borders);
    }

    public Rectangle<T> copyOf(Rectangle<T> rect){
        //TODO
        return rect;
    }

}
