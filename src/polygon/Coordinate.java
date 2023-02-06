package polygon;


import java.util.Objects;

public class Coordinate <T extends Comparable>implements Comparable{
   private  T val;

    public Coordinate(T x) {
        this.val = x;
    }

    public void setVal(T x) {
        this.val = x;
    }

    public T getX() {
        return val;
    }

    @Override
    public boolean equals(Object obj) {
        Coordinate cord=(Coordinate)obj;
        return this.getX().equals(cord.getX());
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + val +
                '}';
    }





    @Override
    public int compareTo(Object o) {
        Coordinate oo = (Coordinate) o;
        return this.getX().compareTo(oo.getX()) ;
    }
}
