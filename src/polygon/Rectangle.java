package polygon;

import exceptions.RectangleException;

import java.util.Collection;
import java.util.EnumMap;

public final class Rectangle <T extends Comparable >{
    private final EnumMap<Direction, T> borders;

    private Rectangle(EnumMap<Direction, T> borders) {
        this.borders = borders;
    }
    T getBorder(Direction direction){
        return this.borders.get(direction);
    }

    public EnumMap<Direction, T> getBorders(Collection<Direction> directions){
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


    public static  <T extends Comparable<? super T> > Rectangle<T> of(T top, T bottom, T left, T right) {
        //TODO make it static
        RectangleException.verifyNonNull(top);
        RectangleException.verifyNonNull(bottom);
        RectangleException.verifyNonNull(left);
        RectangleException.verifyNonNull(right);
        RectangleException.verifyBounds(left,right);
        RectangleException.verifyBounds(bottom,top);
        /*
        if (bottom.compareTo(top)<0 ||right.compareTo(left)<0){
            throw new IllegalArgumentException("You have a problem bottom="+bottom+ " is greater than top ="+top+" or left="+left +"is greater than right="+right);
        }
        */
        EnumMap<Direction, T> borders=new EnumMap<>(Direction.class);

        borders.put(Direction.TOP,top);
        borders.put(Direction.BOTTOM,bottom);
        borders.put(Direction.LEFT,left);
        borders.put(Direction.RIGHT,right);

        return new Rectangle<>(borders);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "borders=" + borders +
                '}';
    }

    public static <T extends Comparable>  Rectangle<T> copyOf(Rectangle<T> rect){
        EnumMap<Direction, T> borders=new EnumMap<>(Direction.class);

        borders.put(Direction.TOP,rect.getBorder(Direction.TOP));
        borders.put(Direction.BOTTOM,rect.getBorder(Direction.BOTTOM));
        borders.put(Direction.LEFT,rect.getBorder(Direction.LEFT));
        borders.put(Direction.RIGHT,rect.getBorder(Direction.RIGHT));

        return new Rectangle<>(borders);

    }


}
