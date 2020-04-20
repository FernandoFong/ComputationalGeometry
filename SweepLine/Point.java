/**
 * This abstract class is for Sweep line algorithm implementation only, maybe
 * someone can adapt it to something else.
 * Each point knows who is the segment they belong to so they can find them
 * at the state line, and perform.
 */
public abstract class Point implements Comparable<Point>{

    private int x;
    private int y;
    private int id; //The segment they belong to.
    private boolean sweepX;

    /**
     * The only way you can construct a point, you can't modify the values once the
     * point is instanciated.
     * @param <code>int</code> x, the coordinate of the x-axis.
     * @param <code>int</code> y, the coordinate of the y-axis.
     * @param <code>int</code> id, the id of the segment they belong to.
     */
    public Point(int x, int y, int id, boolean sx) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.sweepX = sx;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public int compareTo(Point p) {
        return -1
    }

    public abstract void act(State line);
}
