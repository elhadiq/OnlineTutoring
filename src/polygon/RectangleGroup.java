package polygon;

import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

final public class RectangleGroup {
    final private  Set<Rectangle> rectangles;
    final private PlaneMap planeMap;
    final private NavigableMap<IndexPair, Long> matrixGrid;
    private final boolean isOverlapping;


    private RectangleGroup(Set<Rectangle> rectangles) {

        this.rectangles = rectangles;
        planeMap = PlaneMap.from(rectangles);
        matrixGrid=new TreeMap<IndexPair, Long>();
        AtomicBoolean overlap= new AtomicBoolean(false);
        rectangles.forEach(rectangle -> {
            Grid grid=Grid.from(rectangle);
            for (IndexPair indexPair:grid
                 ) {
                if (!(matrixGrid.containsKey(indexPair)))
                    matrixGrid.put(indexPair, 1L);
                else {
                    overlap.set(true);
                    matrixGrid.put(indexPair, matrixGrid.get(indexPair) + 1L);
                }
            }
        });
        isOverlapping = overlap.get();

    }

    public Set<Rectangle> getRectangles() {
        return rectangles;
    }

    public PlaneMap getPlaneMap() {
        return planeMap;
    }

    public NavigableMap<IndexPair, Long> getMatrixGrid() {
        return matrixGrid;
    }

    public static RectangleGroup from(Set<Rectangle> rectangles){
        return new RectangleGroup(rectangles);
    }

    public boolean isOverlapping() {
        return isOverlapping;
    }

    @Override
    public String toString() {
        return "\n, matrixGrid=" + matrixGrid ;
    }
}
