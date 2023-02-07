package polygon;

import java.util.Iterator;

public final class Grid implements Iterable<IndexPair> {
    private final Rectangle<Integer> rectangle;

    private Grid(Rectangle<Integer> rectangle) {
        this.rectangle = rectangle;
    }

    public static Grid from(Rectangle<Integer> rectangle) {
        return new Grid(rectangle);
    }

    public Integer bottom() {
        return rectangle.bottom();
    }

    public Integer top() {
        return rectangle.top();
    }

    public Integer left() {
        return rectangle.left();
    }

    public Integer right() {
        return rectangle.right();
    }


    @Override
    public String toString() {
        return "Grid{" +
                "rectangle=" + rectangle +
                '}';
    }


    @Override
    public Iterator<IndexPair> iterator() {
        return new MyIterator(this.rectangle);
    }

    private static class MyIterator implements Iterator<IndexPair> {
        private   Rectangle<Integer> rectangle;
        private IndexPair index ;
        private final IndexPair last;

        public MyIterator(Rectangle<Integer> rectangle) {
            this.rectangle = rectangle;
            this.index = new IndexPair(-1,-1);
            this.last=new IndexPair(rectangle.right(),rectangle.top());
        }


        @Override
        public boolean hasNext() {
            return index.compareTo(last)<0;
        }

        @Override
        public IndexPair next() {
            if (this.hasNext()){
                if (index.compareTo(new IndexPair(-1,-1))==0) {
                    index=new IndexPair(rectangle.left(),rectangle.bottom());
                }else {
                    index= index.yIndex()<rectangle.top()-1?index.increment(Direction.TOP):new IndexPair(index.xIndex()+1, rectangle.bottom());
                }
            }
            return index;
        }
}


}

