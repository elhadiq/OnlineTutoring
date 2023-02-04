package exceptions;

import java.util.Set;

public class RectangleException extends Exception{
    public enum Error{
        NULL_POINTERS,INVALID_BOUNDS
    }
    private final Error error;
    private Set<Integer> indexes;
    private Object lesserBound;
    private Object greaterBound;
    public RectangleException(String message, Error error) {
        super(message);
        this.error = error;
    }
    public RectangleException(Error error) {
        this.error = error;
        this.indexes=null;
        this.lesserBound=null;
        this.greaterBound=null;
    }
    public RectangleException(Set<Integer> indexes){
        this.indexes=indexes;
        this.error=Error.NULL_POINTERS;
        this.lesserBound=null;
        this.greaterBound=null;
    }
    public RectangleException(Error error, Object lesserBound,Object greaterBound){
        this.indexes=null;
        this.error=error;
        this.lesserBound=lesserBound;
        this.greaterBound=greaterBound;
    }
    @Override
    public String toString() {
        return this.error+" : "+super.toString();
    }

    public static  <T extends Comparable <? super T> > void verifyBounds(T lesserBound, T greaterBound){
        //Since IllegalArgumentException is an unchecked exception, it does not need to be declared in
        // the throws clause
        // of a method or constructor.
        if( greaterBound.compareTo(lesserBound)<0){
            throw new IllegalArgumentException();
        }
    }
    public static  void verifyNonNull(Object varArg){
        if(varArg==null){
            throw new IllegalArgumentException();
        }

    }

}
