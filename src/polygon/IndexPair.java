package polygon;

public record IndexPair(Integer xIndex,Integer yIndex) implements Comparable<IndexPair> {
    @Override
    public int compareTo(IndexPair o) {
        return this.xIndex()-o.xIndex()!=0?this.xIndex()-o.xIndex():this.yIndex()-o.yIndex();
    }
    public IndexPair increment(Direction direction){
        int i,j;
        switch (direction){
            case TOP -> {
                i=0;
                j=1;
            }
            case BOTTOM -> {
                i=0;
                j=-1;
            }
            case LEFT -> {
                i=-1;
                j=0;
            }
            default -> {
                i=1;
                j=0;
            }
        }
        return new IndexPair(this.xIndex()+i,this.yIndex()+j);
    }
}
