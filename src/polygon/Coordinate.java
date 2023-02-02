package polygon;
public class Coordinate <T extends Comparable <T> > {
   private  T x;
   private T y;

    public Coordinate(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
