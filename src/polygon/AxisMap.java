package polygon;

import java.util.*;


public final class AxisMap <S extends Comparable> {
    public Map<S, Integer> index;

    public AxisMap(Map<S, Integer> index) {
        /**
         * The AxisMap a private constructor that sets the index to its argument.
         */
        this.index = index;
    }

    public static <S extends Comparable>  AxisMap from(Collection<S> coordinates){
        /**
         * static AxisMap from(Collection<S> coordinates)
         * returns a new AxisMap starting from the given coordinates
         */
        Map<S, Integer> index= new HashMap<S, Integer>();
        //We dont allow redundant key, two keys that have the same value will be considered as one
        Collections.sort((List<S>) coordinates);
        for (int i=0;i<coordinates.size();i++){
            index.put(((List<S>) coordinates).get(i),i);
        }
        return new AxisMap(index);
    }
    Integer flatIndexOf(S value){

        if (value==null||this.index==null||!this.index.containsKey(value)){
            return null;
        }
        return this.index.get(value);
    }

   public Optional<Integer> indexOf(S value){
            return Optional.ofNullable(this.flatIndexOf(value));
    }
    public int size(){
        return this.index.size();
    }
    @Override
    public String toString() {
        return "AxisMap{" +
                "index=" + index +
                '}';
    }
}
