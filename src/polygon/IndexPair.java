package polygon;

public record IndexPair(Integer xIndex,Integer yIndex) implements Comparable<IndexPair> {
    @Override
    public int compareTo(IndexPair o) {
        return this.xIndex()-o.xIndex()!=0?this.xIndex()-o.xIndex():this.yIndex()-o.yIndex();
    }
    public IndexPair increment(Direction direction){
        int x,y;
        switch (direction){
            case TOP -> {
                x=0;
                y=1;
            }
            case BOTTOM -> {
                x=0;
                y=-1;
            }
            case LEFT -> {
                x=-1;
                y=0;
            }
            default -> {
                x=1;
                y=0;
            }
        }
        return new IndexPair(this.xIndex()+x,this.yIndex()+y);
    }
}
