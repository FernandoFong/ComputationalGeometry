/**
 * Segment class for the SweepLine algorithm, each segment has
 * two points, the beginning and the ending, we can compare two
 * segments either in x-axis or y-axis and its comparable so it can use
 * the Java's Datastructures.
 */
public class Segment implements Comparable<Segment>{

    private Begin b;
    private End d;
    private int id;
    private boolean xaxis; //flag in case we are sweeping on the x-axis.

    // public Segment(int x1, int y1, int x2, int y2, int id, boolean c) {
    //     this.b = new Begin(x1, y1, id, c);
    //     this.d = new End(x2, y2, id, c);
    //     this.id = id;
    //     this.xaxis = c;
    // }

    public Segment(Begin b, End d, int id, boolean c) {
        this.b = b;
        this.d = d;
        this.id = id;
        this.xaxis = c;
    }

    public Begin getBegin() {
        return this.b;
    }

    public End getEnd() {
        return this.d;
    }

    @Override
    public int compareTo(Segment s) {
        return -1;
    }

    /**
     * Method that in case of an intersection with another segment, it will return
     * the point of intersection among the two segments. <code>null</code>
     * otherwise.
     * @param <code>Segment</code> the segment to check if they intersect.
     * @return <code>null</code> if they dont, an instance of
     * <code>Intersection</code> if they do with the coordinates of the
     * intersection point.
     */
    public Intersection intersectsWith(Segment s) {
        return null;
    }

    public String toString() {
        return "S"+Integer.toString(this.id+1);
    }
}
