package polygon;

import java.util.*;

public final class PlaneMap {
    private AxisMap x;
    private AxisMap y;

    private PlaneMap(AxisMap x, AxisMap y) {
        this.x = x;
        this.y = y;
    }
    public static <S extends Comparable> PlaneMap of(Collection<S> x, Collection<S> y){
        AxisMap xx=AxisMap.from(x);
        AxisMap yy=AxisMap.from(y);
        return new PlaneMap(xx,yy);
    }

    public <T extends Comparable> Optional<Integer> xIndexOf(T value){
        return this.x.indexOf(value);
    }

    public <T extends Comparable> Optional<Integer> yIndexOf(T value){
        return this.y.indexOf(value);
    }

    public int xSize(){
        return this.x.size();
    }
    public int ySize(){
        return this.y.size();
    }

    public <T extends Comparable > int indexOf(T value, boolean horizontal){
        if( horizontal){
            return this.y.flatIndexOf(value);
        }
        else {
             return this.x.flatIndexOf(value);
        }

    }
    public static <S extends Comparable> PlaneMap from(Set<Rectangle> rectangles){
        List<S> x= new ArrayList<>();
        List<S> y=new ArrayList<>();
        for (Rectangle rect:rectangles
             ) {
            rect.getBorders(Direction.VERTICAL_BOUNDS).values().forEach(val->y.add((S) val));
            rect.getBorders(Direction.HORIZONTAL_BOUNDS).values().forEach(val->x.add((S) val));
        }
        return  PlaneMap.of(x,y);
    }
    @Override
    public String toString() {
        return "PlaneMap{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
