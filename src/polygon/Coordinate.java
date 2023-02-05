package polygon;


import java.util.Objects;

public class Coordinate <T extends Comparable>implements Comparable{
   private  T x;

    public Coordinate(T x) {
        this.x = x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getX() {
        return x;
    }

    @Override
    public boolean equals(Object obj) {
        Coordinate cord=(Coordinate)obj;
        return this.getX().equals(cord.getX());
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                '}';
    }





    @Override
    public int compareTo(Object o) {
        Coordinate oo = (Coordinate) o;
        return this.getX().compareTo(oo.getX()) ;
    }
}
